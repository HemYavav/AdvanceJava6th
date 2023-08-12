package LabReport.LAB1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginForm extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginForm() {
        super("Login Form");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null); // Not recommended in practice

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(20, 20, 80, 25);
        add(usernameLabel);

        usernameField = new JTextField(20);
        usernameField.setBounds(100, 20, 160, 25);
        add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(20, 50, 80, 25);
        add(passwordLabel);

        passwordField = new JPasswordField(20);
        passwordField.setBounds(100, 50, 160, 25);
        add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 90, 80, 25);
        add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (validateLogin(username, password)) {
                    JOptionPane.showMessageDialog(LoginForm.this, "Login successful!");
                 dispose();
                    new WelcomePage();
                    // Open the Welcome form here
                    
                } else {
                    JOptionPane.showMessageDialog(LoginForm.this, "Incorrect username or password.");
                }
            }
        });

        setVisible(true);
    }
    

    

    private boolean validateLogin(String username, String password) {
        try {
            // Load the JDBC driver and establish a connection
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:4306/userdb", "root", "");

            String query = "SELECT * FROM users WHERE username=? AND password=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();
            boolean result = resultSet.next();

            resultSet.close();
            preparedStatement.close();
            connection.close();

            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginForm();
            }
        });
    }
    
    
    
    
}

class  WelcomePage extends JFrame{
  private JFrame frame;
       WelcomePage(){
        
      frame = new JFrame("Welcome Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,300,300, 200);
        frame.setLayout(new BorderLayout());

        JLabel welcomeLabel = new JLabel("Welcome to our application!");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);

        JButton logoutButton = new JButton("Logout");
        logoutButton.addActionListener(e -> {
            frame.dispose(); // Close the welcome page
            // You can add code here to navigate back to the login page or perform other actions.
        });

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(welcomeLabel, BorderLayout.CENTER);
        panel.add(logoutButton, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setVisible(true);
    }

    

}
