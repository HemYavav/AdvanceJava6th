
package advancejava6th;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class PanelDemoTask extends JFrame{

    JFrame frame;
    JPanel panel2, panel3, panel5, panel4;
    JButton button, nxtBtn,ldButton, rbButton;
    public PanelDemoTask() {
     
        setTitle("Demo Of Jpanel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        setLayout(null);
        
        panel2 = new JPanel();
        panel2.setBackground(Color.red);
        panel2.setBounds(0,0,150,150);
        button =new JButton("Button1");
        panel2.add(button);
        


        panel3 = new JPanel();
        panel3.setBackground(Color.yellow);
        panel3.setBounds(350,0,150,150);
        nxtBtn =new JButton("Next Button");
        panel3.add(nxtBtn);
      
        
  
            panel4   = new JPanel();
        panel4.setBackground(Color.blue);
        panel4.setBounds(0,350,150,150);
        ldButton =new JButton("ldButton Button");
        panel4.add(ldButton);
        
//        
//        
              panel5 = new JPanel();
        panel5.setBackground(Color.green);
        panel5.setBounds(350,350,150,150);
        nxtBtn =new JButton("Next Button");
        panel5.add(nxtBtn);
//        
        
        
        
        
        add(panel2);
                add(panel3);
                add(panel4);

                add(panel5);
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    
    }
    
    
    
    public static void main(String[] args) {
        new PanelDemoTask();
    }
    
}
