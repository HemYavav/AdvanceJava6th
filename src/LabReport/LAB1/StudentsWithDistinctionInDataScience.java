package LabReport.LAB1;

import java.sql.*;

public class StudentsWithDistinctionInDataScience {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Load the MySQL JDBC driver
        Class.forName("com.mysql.jdbc.Driver");

        // Create a connection to the database
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:4306/college",
                "root", "");

        // Create a statement
        Statement statement = connection.createStatement();

        // Execute a query
        String query = "SELECT * FROM students WHERE division = 'Distinction' AND major = 'Data Science'";
        ResultSet resultSet = statement.executeQuery(query);

        // Process the results
        while (resultSet.next()) {
            System.out.println("Roll no: " + resultSet.getInt("rollno"));
            System.out.println("Name: " + resultSet.getString("name"));
            System.out.println("Level: " + resultSet.getString("level"));
            System.out.println("Division: " + resultSet.getString("division"));
            System.out.println("Major: " + resultSet.getString("major"));
            System.out.println("------------------------------------------");
        }

        // Close the connection and statement
        resultSet.close();
        statement.close();
        connection.close();
    }
}