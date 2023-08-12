/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package advancejava6th.Design;
import javax.swing.*;

class LoginForm extends JFrame{
    JPanel mypanel;
    JLabel lblUser, lblPass;
    JTextField txtUser;
    JPasswordField jpf;
    JButton btnLogin, btnCancel;
    public LoginForm(){
        setTitle("Simple Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLayout(null);
        mypanel = new JPanel();
        
        lblUser = new JLabel("Username: ");
        mypanel.add(lblUser);
        txtUser = new JTextField(10);
        mypanel.add(txtUser);
        lblPass = new JLabel("Password: ");
        mypanel.add(lblPass);
        jpf = new JPasswordField(10);
        mypanel.add(jpf);
        btnLogin = new JButton("Login");
        mypanel.add(btnLogin);
        btnCancel = new JButton("Cancel");
        mypanel.add(btnCancel);
        
        add(mypanel);
        setSize(200,180);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
/**
 *
 * @author MODERN
 */
public class NewLoginFormTIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new LoginForm();
    }
    
}