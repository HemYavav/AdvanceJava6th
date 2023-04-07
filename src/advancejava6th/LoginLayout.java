/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advancejava6th;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/*
public class LoginLayout extends JFrame implements ActionListener {
    
    JLabel userLabel, passLabel;
    JTextField userTextField;
    JPasswordField passTextField;
    JButton loginButton, clearButton;
    
    LoginLayout() {
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        
        userLabel = new JLabel("Username:");
        userLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        userLabel.setBounds(10, 10, 80, 25);
        add(userLabel);
        
        userTextField = new JTextField();
        userTextField.setBounds(100, 10, 160, 25);
        add(userTextField);
        
        passLabel = new JLabel("Password:");
        passLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        passLabel.setBounds(10, 40, 80, 25);
        add(passLabel);
        
        passTextField = new JPasswordField();
        passTextField.setBounds(100, 40, 160, 25);
        add(passTextField);
        
        loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        loginButton.addActionListener(this);
        add(loginButton);
        
        clearButton = new JButton("Clear");
        clearButton.setBounds(180, 80, 80, 25);
        clearButton.addActionListener(this);
        add(clearButton);
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String user = userTextField.getText();
            String pass = String.valueOf(passTextField.getPassword());
            if (user.equals("admin") && pass.equals("password")) {
                JOptionPane.showMessageDialog(this, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == clearButton) {
            userTextField.setText("");
            passTextField.setText("");
        }
    }
    
    public static void main(String[] args) {
        new LoginLayout();
    }
}


*/
public class LoginLayout extends JFrame {

    private JPanel panel;
    private JLabel usernameLabel, passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginLayout() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // create panel with null layout
        panel = new JPanel(null);

        // create username label and text field
        usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(10, 20, 80, 25);
        panel.add(usernameLabel);

        usernameField = new JTextField(20);
        usernameField.setBounds(100, 20, 165, 25);
        panel.add(usernameField);

        // create password label and text field
        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordField = new JPasswordField(20);
        passwordField.setBounds(100, 50, 165, 25);
        panel.add(passwordField);

        // create login button
        loginButton = new JButton("Login");
        loginButton.setBounds(100, 90, 80, 25);
        panel.add(loginButton);

        // add panel to the frame
        add(panel);

        // display the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginLayout();
    }
}

