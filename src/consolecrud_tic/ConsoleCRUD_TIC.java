package consolecrud_tic;

//Step 1. Import the packages
import java.sql.*;


class ConsoleJDBC
{
    
    
    
    
    
    
    public ConsoleJDBC()
    {
        try {
            //Step 2. Load and register the appropriate driver
            Class.forName("com.mysql.jdbc.Driver");
            //Step 3. Create or establish the connection
            String url = "jdbc:mysql://localhost:4306/triton_jdbc";
            String user="root";
            String pass = "";
            Connection conn = DriverManager.getConnection(url, user,pass);
            //Step 4. Create a statment using above connection object
            Statement stmt = conn.createStatement();
            //Step 5. Create and execute a query
            String insertQuery = "INSERT INTO student values(2,'Sita',22)";
            int checkForInsert = stmt.executeUpdate(insertQuery);
            if(checkForInsert>0) {
                //Show the successfull message
                System.out.println("Record inserted successfully...");
            } else {
                System.out.println("Failed to insert record...");
            }
            //Step 6. Closing the connection
            conn.close();
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        } 
    }
}

public class ConsoleCRUD_TIC {
    public static void main(String[] args) {
        // TODO code application logic here
        new ConsoleJDBC();
    }   
}
