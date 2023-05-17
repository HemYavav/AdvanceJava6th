package crudOperationGUI;

import java.sql.*;

public class Insert {

//     Connection con = null;
        public Insert(InsertEncap ie) {

        try {
            System.out.println("before connection");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo", "root", "Nano2023@hem");

            System.out.println("after");

            PreparedStatement preparedStatement = con.prepareStatement("insert into student values(?,?,?)");

            System.out.println("database");

            preparedStatement.setInt(1, ie.getSid());
            preparedStatement.setString(2, ie.getSname());
            preparedStatement.setInt(3, ie.getSage());
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
