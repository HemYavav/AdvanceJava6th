/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package advancejava6th.Design;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author MODERN
 */
public class PanelDemoTIC extends JFrame {

    JPanel panel2, panel3, panel4, panel5;
    JButton btnAdd, nextBtn,subBtn, hubBtn;

    public PanelDemoTIC() {
        setTitle("Demo of JPanel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout(null);
        setLayout(null);
        panel2 = new JPanel();
//        panel2.setLayout(null);
        panel2.setBackground(Color.red);
        panel2.setBounds(0, 0, 200, 200);
        btnAdd = new JButton("ADD");
        panel2.add(btnAdd);
//        add(panel2);

        panel3 = new JPanel();
        panel3.setBackground(Color.BLACK);
        panel3.setBounds(210, 210, 200, 200);
        nextBtn = new JButton("NEXT");
        panel3.add(nextBtn);
        
        panel4 = new JPanel();
        panel4.setBackground(Color.cyan);
        panel4.setBounds(0,0,400,500);
        subBtn = new JButton("SUB");
        panel4.add(subBtn);
        
        panel5 = new JPanel();
        panel5.setBackground(Color.yellow);
        panel5.setBounds(0,0,600,600);
        hubBtn = new JButton("STORE");
        panel5.add(hubBtn);
        

        add(panel2);
        add(panel3);
        add(panel4);
        add(panel5);

        setSize(500, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new PanelDemoTIC();
    }

}