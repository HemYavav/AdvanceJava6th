package crudOperationGUI;
import java.sql.*;

public class Update {

    InsertEncap ie;
    public Update(InsertEncap ie) {
        this.ie = ie;
        try {
               Connection con = ConnectionProviders.getConnection();
            System.out.println("get connection");
        PreparedStatement preparedStatement = con.prepareStatement("update account set name =? and age =? where id=?");
        preparedStatement.setString(1, ie.getSname());
        preparedStatement.setInt(2, ie.getSage());
        preparedStatement.setInt(3, ie.getSid());
        
            System.out.println("fetch data");
        preparedStatement.executeUpdate();
       
            System.out.println("run query");
        } catch (Exception e) {
        }
 
    }
    
}
