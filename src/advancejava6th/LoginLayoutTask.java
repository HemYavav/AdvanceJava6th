package advancejava6th;

import javax.swing.*;
import java.awt.*;


class LoginForm1 extends JFrame {

//    JPanel panel;
//    JLabel heading, usernameLabel, PasswordLabel;
//    JButton btnLogin, btnCancel;
//
//    JTextField usernameText;
//    JPasswordField passwordText;
    
        private JPanel panel;
    private JLabel usernameLabel, passwordLabel, headingJLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;


    public LoginForm1() {
//        setTitle("Login Form");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLocationRelativeTo(null);
//
//        panel = new JPanel(null);
//        
//        
//        heading = new JLabel("Login Form");
//        setBounds(50, 10, 80, 30);
//        panel.add(heading);
//        
    setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        
        
                // create panel with null layout
        panel = new JPanel(null);
        
        
        headingJLabel = new JLabel("Login Form");
                headingJLabel.setBounds(150, 10, 150, 25);
                panel.add(headingJLabel);
        
        

        // create username label and text field
        usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(10, 50, 80, 25);
        panel.add(usernameLabel);
        
        
        
        usernameField = new JTextField(20);
        usernameField.setBounds(100, 50, 165, 25);
        panel.add(usernameField);
        
        
        
        
                // create username label and text field
        passwordLabel = new JLabel("Username:");
        passwordLabel.setBounds(10, 100, 80, 25);
        panel.add(passwordLabel);
        
        
        
        passwordField = new JPasswordField(20);
        passwordField.setBounds(100, 100, 165, 25);
        panel.add(passwordField);
        
        

//        
        
        
        add(panel);
                setSize(400, 300);
        setVisible(true);

    }

}

public class LoginLayoutTask {

    public static void main(String[] args) {
        new LoginForm1();
    }

}
