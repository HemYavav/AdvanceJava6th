package DatabaseConnections.rowsetdemo;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.JdbcRowSet;

public class RowSetDemo {
   public RowSetDemo()
   {
       try {
             Class.forName("com.mysql.jdbc.Driver");
             RowSetFactory rsProvider = RowSetProvider.newFactory();
             JdbcRowSet rs = rsProvider.createJdbcRowSet();
             //JdbcRowSet rst = RowSetProvider.newFactory().createJdbcRowSet();
             rs.setUrl("jdbc:mysql://localhost:4306/scrollabledb");
             rs.setUsername("root");
             rs.setPassword("");
             rs.setCommand("select * from employee");
             rs.execute();
             
             System.out.println("Eid \t Name \t Designation \t Salary");
           while (rs.next()) {
              System.out.print(rs.getInt("eid") + "\t");
              System.out.print(rs.getString("ename") + "\t");
              System.out.print(rs.getString("epost") + "\t");
              System.out.println(rs.getInt("esalary") + "\t");
           }
          rs.close();
           
       } catch (Exception e) {
           System.out.println("Error: "+e.getMessage());
       }
   }
   
    public static void main(String[] args) {
        new RowSetDemo();
    }  
}
