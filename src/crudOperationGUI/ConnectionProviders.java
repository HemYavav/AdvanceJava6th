
package crudOperationGUI;

import java.sql.*;

public class ConnectionProviders {
    
    
private ConnectionProviders(){ 
}


    public static Connection getConnection() {
        Connection con = null;

        try {
                Class.forName(DBinfo.DATABASE_DRIVER);
                
         con = DriverManager.getConnection(DBinfo.DATABASE_URL,
                 DBinfo.DATABASE_USERNAME,DBinfo.DATABASE_PASSWORD);
        
        
        
        
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        
    

    
    return con;
    
}
}
