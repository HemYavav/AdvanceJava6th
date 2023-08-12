 package advancejava6th.Design;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;



class LoginTest implements ActionListener {

    JFrame f;
    JLabel lbl1, lbl2;
    JTextField jtf1;
    JPasswordField jpf1;
    JButton btnLogin, btnCancel;

    public LoginTest() {
        f = new JFrame();
        f.setTitle("Simple Login Form");
        f.setBackground(Color.RED);

        lbl1 = new JLabel("Enter username: ");
        jtf1 = new JTextField(20);
        lbl2 = new JLabel("Enter password: ");
        jpf1 = new JPasswordField(20);
        btnLogin = new JButton("Login");
        btnCancel = new JButton("Cancel");

        //Adding all controls 
        f.add(lbl1);
        f.add(jtf1);
        f.add(lbl2);
        f.add(lbl2);
        f.add(jpf1);
        f.add(btnLogin);
        f.add(btnCancel);

        btnLogin.addActionListener(this);

        f.setLayout(new GridLayout(3, 2));
        f.setSize(300, 100);
        f.setLocationRelativeTo(null);
        //f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String username = jtf1.getText();
        String password = String.valueOf(jpf1.getPassword());
        if (validateLogin(username, password)) {
            f.dispose();
            new WelcomeForm();
        } else {
            JOptionPane.showMessageDialog(f, "Invalid username or password!");
        }
    }

    private boolean validateLogin(String username, String password) {
        // JDBC code to validate the username and password
        String url = "jdbc:mysql://localhost:3306/logindb";
        String user = "root";
        String pass = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, pass);
            String query = "SELECT * FROM logintbl WHERE username = ? AND password = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return true; // Valid login credentials
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return false; // Invalid login credentials
    }
}

public class LoginFormWithSwingAndJDBC {

    public static void main(String[] args) {
        new LoginTest();
    }
}

