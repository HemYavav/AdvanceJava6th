package LabReport.LAB1;

import java.sql.*;
import java.util.Scanner;

public class StudentCRUD {

    private static final String JDBC_URL = "jdbc:mysql://localhost:4306/StudentInfo";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            System.out.println("Connected to database");

            while (true) {
                System.out.println("Choose operation:");
                System.out.println("1. Create");
                System.out.println("2. Read");
                System.out.println("3. Update");
                System.out.println("4. Delete");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        createStudent(connection, scanner);
                        break;
                    case 2:
                        readStudents(connection);
                        break;
                    case 3:
                        updateStudent(connection, scanner);
                        break;
                    case 4:
                        deleteStudent(connection, scanner);
                        break;
                    case 5:
                        connection.close();
                        System.out.println("Exiting program.");
                        return;
                    default:
                        System.out.println("Invalid choice. Please select a valid operation.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createStudent(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter student id:");
        int sid = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter student name:");
        String sname = scanner.nextLine();

        System.out.print("Enter student age:");
        int sage = scanner.nextInt();

        String insertQuery = "INSERT INTO student (sid, sname, sage) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
        preparedStatement.setInt(1, sid);
        preparedStatement.setString(2, sname);
        preparedStatement.setInt(3, sage);

        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Student record created successfully.");
        } else {
            System.out.println("Failed to create student record.");
        }
    }

    private static void readStudents(Connection connection) throws SQLException {
        String selectQuery = "SELECT * FROM student";
        PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int sid = resultSet.getInt("sid");
            String sname = resultSet.getString("sname");
            int sage = resultSet.getInt("sage");
            System.out.println("Student ID: " + sid + ", Name: " + sname + ", Age: " + sage);
        }
    }

    private static void updateStudent(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter student id to update:");
        int sid = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter new student name:");
        String sname = scanner.nextLine();

        System.out.print("Enter new student age:");
        int sage = scanner.nextInt();

        String updateQuery = "UPDATE student SET sname = ?, sage = ? WHERE sid = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
        preparedStatement.setString(1, sname);
        preparedStatement.setInt(2, sage);
        preparedStatement.setInt(3, sid);

        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Student record updated successfully.");
        } else {
            System.out.println("Failed to update student record.");
        }
    }

    private static void deleteStudent(Connection connection, Scanner scanner) throws SQLException {
        System.out.println("Enter student id to delete:");
        int sid = scanner.nextInt();

        String deleteQuery = "DELETE FROM student WHERE sid = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
        preparedStatement.setInt(1, sid);

        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Student record deleted successfully.");
        } else {
            System.out.println("Failed to delete student record.");
        }
    }
}
