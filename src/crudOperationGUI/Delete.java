/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudOperationGUI;

import java.sql.*;
/**
 *
 * @author Hem Yadav
 */
public class Delete {

    public Delete(InsertEncap ie) {
        
        
        try {
            Connection con = ConnectionProviders.getConnection();
            
            PreparedStatement preparedStatement = con.prepareStatement("delete from student where id =?");
            preparedStatement.setInt(1, ie.getSid());
            preparedStatement.executeUpdate();
            System.out.println("deleted from table");
            
        } catch (Exception e) {
        }
        
        
    }
    
}
