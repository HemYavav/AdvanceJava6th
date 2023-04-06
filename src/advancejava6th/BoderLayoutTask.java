package advancejava6th;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoderLayoutTask extends JFrame {

    JButton btn1, btn2, btn3, btn4, btn5, btn6;

    public BoderLayoutTask() {

        btn1 = new JButton("Button1");
        btn1.setBackground(Color.GREEN);
        add(btn1, BorderLayout.NORTH);

        add(new JButton("Button2"), BorderLayout.EAST);
        add(new JButton("Button3"), BorderLayout.WEST);
        add(new JButton("Button4"), BorderLayout.SOUTH);
        add(new JButton("Button5"), BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(350, 150, 500, 500);
//        setSize(500,500);
        setVisible(true);
        
        

    }

    public static void main(String[] args) {
        new BoderLayoutTask();

    }

}
