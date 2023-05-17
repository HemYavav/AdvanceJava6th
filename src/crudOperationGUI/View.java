package crudOperationGUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.sql.Statement;

public class View {

    PageForm pageForm;

    public View(InsertEncap ie) {

        try {
            Connection con = ConnectionProviders.getConnection();
            
            
            PreparedStatement preparedStatement=con.prepareStatement("select * from student where id=? ");  
            preparedStatement.setInt(1, ie.getSid());
                    ResultSet rs=preparedStatement.executeQuery();  

//            Statement st = con.createStatement();
//
//            ResultSet rs = st.executeQuery("Select * from student where id =" + ie.getSid());


                pageForm.sidField.setText(Integer.toString(rs.getInt("id")));
                pageForm.snameField.setText(rs.getString("name"));
                pageForm.sageField.setText(Integer.toString(rs.getInt("age")));
            

        } catch (Exception e) {
        }

    }

}
