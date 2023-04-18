
package advancejava6th;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



class RegistrationForm extends JFrame{
    
    JPanel panel;
    JLabel studentDetailHeading,studentJLabel,ageJLabel,sexJLabel ;
    
    
    

    public RegistrationForm() {
        
        setTitle("Student Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400,550);
        setBackground(Color.gray);
//        setResizable(false);

        panel = new JPanel(null);
        
        studentDetailHeading = new JLabel("Student Details");
        setBounds(150, 10, 150, 30);
        studentDetailHeading.setFont(studentDetailHeading.getFont().deriveFont(20).deriveFont(Font.BOLD));
        panel.add(studentDetailHeading);
        
        
        
        
        
        add(panel);
        setVisible(true);
        
    }

}



public class StudentRegistrationForm {
    public static void main(String[] args) {
       new RegistrationForm();
    }
    
}
