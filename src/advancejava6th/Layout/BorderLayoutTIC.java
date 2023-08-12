package advancejava6th.Layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class BorderLayoutTIC extends JFrame{
    JButton btn1, btn2, btn3, btn4,btn5;
    public BorderLayoutTIC(){
     setTitle("Border Layout Demo");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setLayout(new BorderLayout(10,10));
   
    
    //Adding component
    btn1 = new JButton("Button 1");
    btn2 = new JButton("Button 2");
    btn3 = new JButton("Button 3");
    btn4 = new JButton("Button 4");
    btn5 = new JButton("Button 5");
    
    add(btn1, BorderLayout.NORTH); //the second paramater is for palce the button in north
    add(btn2, BorderLayout.SOUTH);
    add(btn3, BorderLayout.EAST);
    add(btn4, BorderLayout.WEST);
    add(btn5);
    

    setSize(500, 300);
    setVisible(true);
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new BorderLayoutTIC();
    }
    
}
