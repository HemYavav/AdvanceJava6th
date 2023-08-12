package advancejava6th.Design;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseMotionAdapterExample extends MouseMotionAdapter{
    JFrame f;
    public MouseMotionAdapterExample(){
        f = new JFrame("Mouse Motion Adapter");
        f.addMouseMotionListener(this);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics g=f.getGraphics();
        g.setColor(Color.red);
        g.fillOval(e.getX(),e.getY(),10,10); 
    }
    public static void main(String[] args) {
        new MouseMotionAdapterExample();
    }
}