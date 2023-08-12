package advancejava6th.Design;

//Step 1. Import the packages
import java.sql.*;
import java.util.Scanner;

class ConsoleJDBC
{  
    Connection conn = null;
    Statement stmt = null;
    public void ConnectionString()
    {
        try {
            //Step 2. Load and register the appropriate driver
            Class.forName("com.mysql.jdbc.Driver");
            //Step 3. Create or establish the connection
            String url = "jdbc:mysql://localhost:3306/triton_jdbc";
            String user="root";
            String pass = "";
            conn = DriverManager.getConnection(url, user,pass);
                //Step 4. Create a statment using above connection object
            stmt = conn.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //for taking input from user 
    public void insertRecord()
    {
        try {
            ConnectionString();
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the id: ");
            int id = Integer.parseInt(input.nextLine());
            System.out.println("Enter the name: ");
            String name = input.nextLine();
            System.out.println("Enter the age: ");
            int age = Integer.parseInt(input.nextLine());
            //Step 5. Create and execute a query
            String insertQuery = "INSERT INTO student values(?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(insertQuery);
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setInt(3, age);
            int checkForInsert = pstmt.executeUpdate();
            if(checkForInsert>0)
            //Show the successfull message
               System.out.println("Record inserted successfully...");
            else
                System.out.println("Failed to insert record...");
             conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
         
           
    }
    
    public void selectRecord()
    {
        ConnectionString();
        try {
                //Display all the records
                String selectQuery = "SELECT * FROM student";
                ResultSet rs = stmt.executeQuery(selectQuery);
                System.out.println("ID\tName\t\tAge");
                while(rs.next()){
                    int i = rs.getInt(1);
                    String n = rs.getString(2);
                    int a = rs.getInt(3);
                    System.out.println(i+"\t"+n+"\t\t"+a);
                }  
        } catch (SQLException ex) {
            System.out.println(ex);
        } 
    }
    
    public void deleteRecord() throws SQLException
    {
         ConnectionString();
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the id to delete record: ");
            int id = input.nextInt();
            //Step 5. Create and execute a query
            String deleteQuery = "delete from student where sid= "+id;
            stmt = conn.createStatement();
            int checkForDelete = stmt.executeUpdate(deleteQuery);
            if(checkForDelete>0)
            //Show the successfull message
               System.out.println("Record deleted successfully...");
            else
                System.out.println("Failed to delete record...");
            conn.close();
    }
    
       public void updateRecord() throws SQLException
    {
         ConnectionString();
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the id to update record: ");
            int id = Integer.parseInt(input.nextLine());
            System.out.println("Enter the name: ");
            String name = input.nextLine();
            System.out.println("Enter the age: ");
            int age = Integer.parseInt(input.nextLine());
            
            //Step 5. Create and execute a query
            String deleteQuery = "update student set sname='"+name+"',sage="+age+" where sid="+id;
            stmt = conn.createStatement();
            int checkForUpdate = stmt.executeUpdate(deleteQuery);
            if(checkForUpdate>0)
            //6.Show the successfull message
               System.out.println("Record updated successfully...");
            else
                System.out.println("Failed to update record...");
            //7.close the connection
            conn.close();
    }
    
    public ConsoleJDBC()
    {
        try {
            insertRecord();
            selectRecord();
            deleteRecord();
            selectRecord();
             updateRecord();
            selectRecord();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}

public class ConsoleCRUD_TIC {
    public static void main(String[] args) {
        // TODO code application logic here
        new ConsoleJDBC();
    }   
}
