package goodframesizetic;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class GoodFrameSizeTIC extends JFrame {
    
    public GoodFrameSizeTIC()
    {
        setTitle("Good Frame Size");
        
        //to know the size of screen and half the screen by using tool kit to get 
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        setSize(screenWidth/2, screenHeight/2);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //to import image 
        Image img = new ImageIcon("image/imageho.jpg").getImage();
        setIconImage(img);
        
    }


    public static void main(String[] args) {
        // TODO code application logic here
        // three way to call constructor
//        GoodFrameSizeTIC frame = new GoodFrameSizeTIC();
//        new GoodFrameSizeTIC();
//        SwingUtilities.invokeLater(new Runnable(){
//            @Override
//            public void run()
//            {
//                new GoodFrameSizeTIC();
//            }
//      by using lamda expression
            SwingUtilities.invokeLater(() -> {
                new GoodFrameSizeTIC();
            });
//        });
    }
    
    
}
