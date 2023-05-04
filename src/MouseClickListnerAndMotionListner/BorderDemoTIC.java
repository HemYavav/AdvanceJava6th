package MouseClickListnerAndMotionListner;

import java.awt.Color;
import javax.swing.*;
public class BorderDemoTIC {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Demo of borders");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        
        JPanel panel = new JPanel();
        //panel.setBackground(Color.yellow);
        panel.setBorder(BorderFactory.createTitledBorder("Title of my Panel"));
        //Adding JLabel
        JLabel label = new JLabel("I am a label");
        label.setBorder(BorderFactory.createLineBorder(Color.red));
        panel.add(label);
        
        //Adding buttons
        JButton btn1 = new JButton("Button 1");
        btn1.setBorder(BorderFactory.createDashedBorder(Color.RED));
        btn1.setToolTipText("You are on Button 1");
        panel.add(btn1);
        
        JButton btn2 = new JButton("Button 2");
        //btn2.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        btn2.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.green));
        panel.add(btn2);
        
        JButton btn3 = new JButton("Button 3");
        btn3.setBorder(BorderFactory.createRaisedBevelBorder());
        panel.add(btn3);
        
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    } 
}
