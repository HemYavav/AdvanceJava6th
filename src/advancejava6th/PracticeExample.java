
package advancejava6th;
import java.awt.HeadlessException;
import javax.swing.*;

public class PracticeExample extends JFrame{
    
    static  class Scrolls extends JFrame{

        public Scrolls() throws HeadlessException {
    super("Hem Narayna Yadav Demo");  
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ImageIcon img = new ImageIcon("/img/child.jpg",null);  
  
JScrollPane png = new JScrollPane(new JLabel(img));  
  
getContentPane().add(png);  
setSize(300,250);  
setVisible(true);     
   
        }
    
        
    }
    
    
    
    public static void main(String[] args) {
        
        Scrolls sc = new Scrolls();
       
        
        
        
        
    }
}
