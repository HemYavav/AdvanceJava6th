package DatabaseConnections;


import java.sql.*;
class ScrollAndUpdate
{
    public ScrollAndUpdate()
    {
        try {
           /* Step 2. Load and Register the database driver */
            Class.forName("com.mysql.jdbc.Driver");
            /* Step 3. Establish the connection with MySQL Database */
//            String url = "jdbc:mysql://localhost:3306/scrollableandupdatabledb";
            String url = "jdbc:mysql://localhost:4306/scrollabledb";



            String user ="root";
            String password = ""; 
            Connection conn = DriverManager.getConnection(url, user, password);
            //Step 4. Create a statement Object
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE); 
           
             /* Step 5. Execute a Query to Select*/
               String selectQuery = "select * from employee ";
               ResultSet rs = stmt.executeQuery(selectQuery);
               
               System.out.println("Previous Records....");
               System.out.println("ID\tName\tDesignation\tSalary");
               while(rs.next())
               {
                   int id = rs.getInt(1);
                   String name = rs.getString(2);
                   String post = rs.getString(3);
                   int salary = rs.getInt(4);
                   System.out.println(id+"\t"+name+"\t"+post+"\t"+salary);
               }
               
               rs.absolute(3); //Point to the third record 
               int newBonus = rs.getInt("esalary") + 1000;
               rs.updateInt("esalary",newBonus);
               rs.updateString("epost", "System Analyst");
               rs.updateRow();
                //rs.deleteRow();
               
               rs = stmt.executeQuery(selectQuery); //Reload records from database
               rs.next();
               System.out.println("Current Records....");
               System.out.println("ID\tName\tDesignation\tSalary");
               rs.last();
               while(rs.previous())
               {
                   int id = rs.getInt(1);
                   String name = rs.getString(2);
                   String post = rs.getString(3);
                   int salary = rs.getInt(4);
                   System.out.println(id+"\t"+name+"\t"+post+"\t"+salary);
              }
            
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
public class ScrollabeAndUpdatableBW {
    public static void main(String[] args) {
      
        new ScrollAndUpdate();
    } 
}
