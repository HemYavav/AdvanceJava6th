package javaapplication1;

import javax.swing.JFrame;


public class JavaApplication1 {

    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setTitle("Advanced Java Programming");
        
//        frame.setSize(300,300);
//        frame.setLocation(300, 250);
       //To set size and location in one line code.
        frame.setBounds(300, 250, 300, 300);
       //To extended the bounds or application to maximaize size
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
       //To center the frame or application
        frame.setLocationRelativeTo(null);
                
        frame.setResizable(false);//to fix the size of application
        frame.setVisible(true);//to visible application
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
