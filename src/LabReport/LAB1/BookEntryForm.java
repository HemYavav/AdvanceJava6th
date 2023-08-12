package LabReport.LAB1;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class BookEntryForm extends JFrame {
    private JTextField idField, nameField, authorField, publicationField, priceField;
    private Connection connection;

    public BookEntryForm() {
        initializeUI();
        connectToDatabase();
    }

    private void initializeUI() {
        setTitle("Book Entry Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Using null layout

        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(20, 20, 80, 20);
        add(idLabel);

        idField = new JTextField();
        idField.setBounds(120, 20, 200, 20);
        add(idField);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 50, 80, 20);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(120, 50, 200, 20);
        add(nameField);

        JLabel authorLabel = new JLabel("Author:");
        authorLabel.setBounds(20, 80, 80, 20);
        add(authorLabel);

        authorField = new JTextField();
        authorField.setBounds(120, 80, 200, 20);
        add(authorField);

        JLabel publicationLabel = new JLabel("Publication:");
        publicationLabel.setBounds(20, 110, 80, 20);
        add(publicationLabel);

        publicationField = new JTextField();
        publicationField.setBounds(120, 110, 200, 20);
        add(publicationField);

        JLabel priceLabel = new JLabel("Price:");
        priceLabel.setBounds(20, 140, 80, 20);
        add(priceLabel);

        priceField = new JTextField();
        priceField.setBounds(120, 140, 200, 20);
        add(priceField);

        JButton insertButton = new JButton("Insert");
        insertButton.setBounds(20, 180, 80, 30);
        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertRecord();
            }
        });
        add(insertButton);

        JButton updateButton = new JButton("Update");
        updateButton.setBounds(110, 180, 80, 30);
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateRecord();
            }
        });
        add(updateButton);

        JButton deleteButton = new JButton("Delete");
        deleteButton.setBounds(200, 180, 80, 30);
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteRecord();
            }
        });
        add(deleteButton);

        JButton viewButton = new JButton("View");
        viewButton.setBounds(290, 180, 80, 30);
        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewRecords();
            }
        });
        add(viewButton);
    }

    private void connectToDatabase() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:4306/Library", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void insertRecord() {
        try {
            String query = "INSERT INTO books (id, name, author, publication, price) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, Integer.parseInt(idField.getText()));
            preparedStatement.setString(2, nameField.getText());
            preparedStatement.setString(3, authorField.getText());
            preparedStatement.setString(4, publicationField.getText());
            preparedStatement.setDouble(5, Double.parseDouble(priceField.getText()));
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to insert record.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateRecord() {
        try {
            String query = "UPDATE books SET name=?, author=?, publication=?, price=? WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, nameField.getText());
            preparedStatement.setString(2, authorField.getText());
            preparedStatement.setString(3, publicationField.getText());
            preparedStatement.setDouble(4, Double.parseDouble(priceField.getText()));
            preparedStatement.setInt(5, Integer.parseInt(idField.getText()));
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to update record.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteRecord() {
        try {
            String query = "DELETE FROM books WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, Integer.parseInt(idField.getText()));
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record deleted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to delete record.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void viewRecords() {
        try {
            String query = "SELECT * FROM books";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String author = resultSet.getString("author");
                String publication = resultSet.getString("publication");
                double price = resultSet.getDouble("price");
                System.out.println("ID: " + id + ", Name: " + name + ", Author: " + author +
                        ", Publication: " + publication + ", Price: " + price);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BookEntryForm().setVisible(true);
            }
        });
    }
}
