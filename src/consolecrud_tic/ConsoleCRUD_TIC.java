package consolecrud_tic;

//Step 1. Import the packages
import java.sql.*;
import java.util.Scanner;

class ConsoleJDBC {
Connection conn = null;    

    public ConsoleJDBC() {
        try {
            //Step 2. Load and register the appropriate driver
            Class.forName("com.mysql.jdbc.Driver");
            //Step 3. Create or establish the connection
            String url = "jdbc:mysql://localhost:4306/triton_jdbc";
            String user = "root";
            String pass = "";
            Connection conn = DriverManager.getConnection(url, user, pass);

            Scanner sc = new Scanner(System.in);

            System.out.println(
                    "1. Insert Data\n"
                    + "2.Update Data\n"
                    + "3.Delete data\n");

            System.out.print("Enter Your choice:");
            int i = sc.nextInt();

            switch (i) {
                case 1:
                        Insert(conn);
                    break;

                case 2:

                    break;
                case 3:
                    delete(conn);
                    break;
                default:
                    throw new AssertionError();
            }

           

        

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public void Insert(Connection conn){
    Scanner sc1 = new Scanner(System.in);
     System.out.print("Enter Student ID: ");
            int id = sc1.nextInt();

            System.out.print("Enter student Name:");
            String name = sc1.next();

            System.out.print("Enter student Age: ");
            int age = sc1.nextInt();
            
        try {
                      
             //Step 4. Create a statment using above connection object
            Statement stmt = conn.createStatement();
            //Step 5. Create and execute a query
            String insertQuery = "INSERT INTO student values("+id+",'"+name+"',"+age+")";
            float checkForInsert = stmt.executeUpdate(insertQuery);
            
            
            
            if (checkForInsert > 0) {
                //Show the successfull message
                System.out.println("Record inserted successfully...");
            } else {
                System.out.println("Failed to insert record...");
            }
            //Step 6. Closing the connection
            conn.close();
   
        } catch (Exception e) {
        }
    }
    
    public void delete(Connection con){
    
        Scanner sc1 = new Scanner(System.in);
     System.out.print("Enter Student ID which you want to delete: ");
            int id = sc1.nextInt();

        
                try {
                      
             //Step 4. Create a statment using above connection object
            Statement stmt = conn.createStatement();
            //Step 5. Create and execute a query
            String deleteQuery = "delete from student where sid = '"+id+"'";
                                System.out.println("I am here111!!");

            float checkForDelete = stmt.executeUpdate(deleteQuery);
                    System.out.println("I am here!!");
            if (checkForDelete > 0) {
                //Show the successfull message
                System.out.println("Record inserted successfully...");
            } else {
                System.out.println("Failed to insert record...");
            }
            //Step 6. Closing the connection
            conn.close();
   
        } catch (Exception e) {
        }
    
    
    }
    public void update(Connection con){
    
    
    }
    
}

public class ConsoleCRUD_TIC {

    public static void main(String[] args) {
        // TODO code application logic here
        new ConsoleJDBC();
    }
}
