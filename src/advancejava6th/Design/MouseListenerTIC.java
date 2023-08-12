package advancejava6th.Design;

import javax.swing.*;
import java.awt.event.*;

public class MouseListenerTIC extends MouseAdapter {

    JFrame frame;
    JLabel l;

    MouseListenerTIC() {
        frame = new JFrame();
        //frame.setLayout(null); 
        l = new JLabel();
        l.setBounds(20, 50, 100, 20);
        frame.add(l);

        frame.addMouseListener(this);

        frame.setLayout(null);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }

    @Override
    public void mouseEntered(MouseEvent e) {

        l.setText("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {

        l.setText("Mouse Exited");
    }

    public static void main(String[] args) {
        new MouseListenerTIC();
    }
}
