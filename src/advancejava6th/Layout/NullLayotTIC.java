package advancejava6th.Layout;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class NullLayotTIC extends JFrame{
    JButton btn1, btn2, btn3, btn4,btn5;
    public NullLayotTIC(){
     setTitle("Grid Layout Demo");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setLayout(null);
   
    
    //Adding component
    btn1 = new JButton("Button 1");
    btn2 = new JButton("Button 2");
    btn3 = new JButton("Button 3");
    btn4 = new JButton("Button 4");
    btn5 = new JButton("Button 5");
    
    btn1.setBounds(50,100,100,25);
    btn2.setBounds(50,125,100,25);
    
    add(btn1); //the second paramater is for palce the button in north
    add(btn2);
    add(btn3);
    add(btn4);
    add(btn5);
    

    setSize(500, 300);
    setVisible(true);
//    pack();
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new NullLayotTIC();
    }
}
    
