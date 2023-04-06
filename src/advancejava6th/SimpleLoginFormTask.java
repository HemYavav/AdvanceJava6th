
package advancejava6th;

import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class LoginForm extends JFrame{
    JPanel mypanel;
    JLabel lbUser, lbPass;
    JTextField textUser;


    JPasswordField txtPass;
    JButton btnLogin, btnCancel;

    public LoginForm() {
        
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLayout(null);
        mypanel = new JPanel();
        
        
        
        lbUser = new JLabel("Username: ");
        mypanel.add(lbUser);
        textUser = new JTextField(25);
        mypanel.add(textUser);
        
        
              lbPass = new JLabel("Password: ");
        mypanel.add(lbPass);
        txtPass = new JPasswordField(25);
        mypanel.add(txtPass);
        
        
        btnLogin = new JButton("Login");
        mypanel.add(btnLogin);
        
        btnCancel = new JButton("Cancel");
        mypanel.add(btnCancel);
        
       
        
        add(mypanel);
        
        setSize(500,400);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    
    
    
    
}

public class SimpleLoginFormTask {
    public static void main(String[] args) {
        new LoginForm();
    }
    
}
