package advancejava6th.Design;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;

class MyPanel extends JPanel
{
   public MyPanel()
   {
     setPreferredSize(new Dimension(600,500));  
   }
   public void paint(Graphics g)
   {
       super.paint(g);
       
       Graphics2D g2d = (Graphics2D)g;
       
       //1. Draw a line
       g2d.drawLine(20, 50, 80, 50);
       g2d.setStroke(new BasicStroke(6));
       g2d.drawLine(220, 100, 480, 100);
       
       //2.Draw a String using Font
       Font font = new Font("Monotype Corsive", Font.BOLD, 18);
       setFont(font);
       g2d.setColor(Color.blue);
       
       String message = "Welcome in JAVA @D Graphics";
       g2d.drawString(message,  200, 80);
       
       //3. Draw Image
       Image img = new ImageIcon("image/janam.jpg").getImage();
       g2d.drawImage(img, 200, 120, 300, 300, null);
       g2d.setPaint(Color.white);
       g2d.drawString("Its me janam", 300, 300);
       
       //4. Draw a rectangle
       g2d.setPaint(Color.red);
       g2d.drawRect(200, 120, 300, 300);
       
       //5. Draw a round Rectangle 
       g2d.drawRoundRect(100, 100, 50, 50, 15, 18);
       
       //6. Draw an Ellipse
       Ellipse2D oval = new Ellipse2D.Double(100,200,50,80);
       g2d.draw(oval);
       
       //7. Rectangle 2D
       Rectangle2D r = new Rectangle.Float(250, 250, 250, 150);
       g2d.draw(r);
       
       //8.Draw a rectangle using polygon
       int[] xPoints = {20, 50, 80};
       int[] yPoints = {150, 30, 150};
       g2d.setPaint(Color.black);
       g2d.drawPolygon(xPoints, yPoints, 3);
       
       
   }
   
}

public class TwoDShapes {

    
    public static void main(String[] args) {
        JFrame frame = new JFrame("TwoD Shape Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        frame.add(new MyPanel());
        frame.pack();
        frame.setVisible(true);
        
        
    }
    
}
