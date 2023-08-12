/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancejava6th.Design;
import javax.swing.*;
import java.awt.*;

class GuiControls extends JFrame{
    JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6;
    JTextField jtf;
    JPasswordField jpf;
    JRadioButton jrb1, jrb2;
    JCheckBox jcb1, jcb2, jcb3, jcb4;
    JComboBox combo;
    JTextArea jta;
    JButton btnSubmit;
    
    public GuiControls(){
        
        setLayout(null);
        /* Label for Username */
        lbl1 = new JLabel("Username:");
        lbl1.setBounds(50,50,150,25);
        add(lbl1);
        /* Textfield for username */
        jtf = new JTextField();
        jtf.setBounds(200,50,150,25);
        add(jtf);
        /* Label for Password*/
        lbl2 = new JLabel("Password:");
        lbl2.setBounds(50,90,150,25);
        add(lbl2);
        /* TextField for Password*/
        jpf = new JPasswordField();
        jpf.setBounds(200,90,150,25);
        add(jpf);
        /* Label for Gender: */
        lbl3 = new JLabel("Gender:");
        lbl3.setBounds(50,130,150,25);
        add(lbl3);
        /* Radio button for Gender */
        jrb1 = new JRadioButton("Male");
        jrb1.setBounds(200,130,80,25);
        add(jrb1);
        jrb2 = new JRadioButton("Female");
        jrb2.setBounds(280,130,80,25);
        add(jrb2);
        /* ButtonGroup for gender to make single selection*/
        ButtonGroup grp = new ButtonGroup();
        grp.add(jrb1);
        grp.add(jrb2);
        
        /* Label for Hobbiers*/
        lbl4 = new JLabel("Hobbies:");
        lbl4.setBounds(50,170,150,25);
        add(lbl4);
        /* CheckBox for Hobbies*/
        jcb1 = new JCheckBox("Playing");
        jcb2 = new JCheckBox("Reading");
        jcb3 = new JCheckBox("Visiting");
        jcb4 = new JCheckBox("Ticketing");
        jcb1.setBounds(200,170,150,25);
        jcb2.setBounds(200,200,150,25);
        jcb3.setBounds(200,230,150,25);
        jcb4.setBounds(200,260,150,25);
        add(jcb1); add(jcb2); add(jcb3); add(jcb4); 
        /* Select country using combo box*/
        lbl5 = new JLabel("Select Country:");
        lbl5.setBounds(50,300,150,25);
        add(lbl5);
        /* Combo box using String Array*/
        String[] countries = {"Nepal","India","China","Others"};
        combo = new JComboBox(countries);
        combo.setBounds(200,300,150,25);
        add(combo);
        
        /*label for Comments*/
        lbl6 = new JLabel("Comments:");
        lbl6.setBounds(50,340,150,25);
        add(lbl6);
        
        /* TextArea for Comments*/
        jta = new JTextArea();
        jta.setBounds(200,340,150,100);
        jta.setBackground(Color.LIGHT_GRAY);
        add(jta);
        /* Button for Submit */
        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(200,450,100,25);
        add(btnSubmit);
        
        /*Adding Different methods related to 
        Components class in a JFrame*/
        setTitle("Different GUI Controls");
        setLayout(null);
        setSize(400,550);
        //setExtendedState(MAZIMIZED_BOTH);
        setTitle("Different GUI Controls");
        setLocationRelativeTo(null);
        
        setSize(400,550);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

/**
 *
 * @author Janam
 */
public class Guicontrolstic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new GuiControls();
    }
    
}
