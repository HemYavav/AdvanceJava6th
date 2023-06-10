/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advancejava6th;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Hem Yadav
 */
public class GridLayoutTask extends JFrame{
    
    
    JButton btn1;
    public GridLayoutTask() {
        
        setLayout(new GridLayout());
        
         btn1 = new JButton("Button1");
        btn1.setBackground(Color.GRAY);
        btn1.setText("NiShikar");
        
        add(btn1, BorderLayout.NORTH);
        
        
                add(new JButton("Button2"), BorderLayout.EAST);
        add(new JButton("Button3"), BorderLayout.WEST);
        add(new JButton("Button4"), BorderLayout.SOUTH);
        add(new JButton("Button5"), BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 140, 500, 500);
//        setSize(500,500);
        setVisible(true);
        
        
    }
    
    
    
    public static void main(String[] args) {
        new GridLayoutTask();
    }
    
    

    
}





