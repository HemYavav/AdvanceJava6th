package loginformtest;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFormWithSwingAndJDBC{
    public static void main(String[] args) {
        JLabel lbl1, lbl2;
        JTextField jtf1;
        JPasswordField jpf1;
        JButton btnLogin, btnCancel;
    
        JFrame f = new JFrame();
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
         
         
        f.setLayout(new GridLayout(3, 2));
        f.setSize(300,100);
        f.setLocationRelativeTo(null);
        //f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
}
