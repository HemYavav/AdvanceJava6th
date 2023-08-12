package advancejava6th.Design;

/*
5(h) Write a program to display the record from the table students who have got distinction and have a 
major subject Data Science. Assume that the student table in the database College and contains the 
column Roll no, Name, Level, Division and Major.
*/

import java.sql.*;
import java.util.logging.*;

class CollegeJDBC {

    Connection conn = null;
    Statement stmt = null;

    public void ConnectionString() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/college";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CollegeJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void SelectRecord() {
        try {
            ConnectionString();
            String selectQuery = "SELECT * FROM students where Division='Distinction' AND major='Data Science'";
            ResultSet rs = stmt.executeQuery(selectQuery);
            System.out.println("Roll \t Name \t Level \t Division \t Major ");
            while (rs.next()) {
                int i = rs.getInt(1);
                String n = rs.getString(2);
                String l = rs.getString(3);
                String d = rs.getString(4);
                String m = rs.getString(5);

                System.out.println(i+"\t"+n+"\t"+l+"\t"+d+"\t"+m);
            }
        } catch (SQLException ex) {
            System.out.println("cant display"+ex);
        }

    }
    public CollegeJDBC(){
        SelectRecord();
    }
}

public class CollegeRecord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        new CollegeJDBC();
    }

}
