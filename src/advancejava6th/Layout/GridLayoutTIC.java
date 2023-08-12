package advancejava6th.Layout;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class GridLayoutTIC extends JFrame{
    JButton btn1, btn2, btn3, btn4,btn5;
    public GridLayoutTIC(){
     setTitle("Grid Layout Demo");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setLayout(new GridLayout(3,3,15,15));
   
    
    //Adding component
    btn1 = new JButton("Button 1");
    btn2 = new JButton("Button 2");
    btn3 = new JButton("Button 3");
    btn4 = new JButton("Button 4");
    btn5 = new JButton("Button 5");
    
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
        new GridLayoutTIC();
    }
}
    
