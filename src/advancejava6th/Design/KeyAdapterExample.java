package advancejava6th.Design;

import java.awt.event.*;

import javax.swing.*;

public class KeyAdapterExample extends KeyAdapter{
    JLabel lbl;
    JTextArea area;
    JFrame f;

    KeyAdapterExample() {
        f = new JFrame("Key Adapter");
        lbl = new JLabel();
        lbl.setBounds(20,50,200,20);
        area = new JTextArea();
        area.setBounds(20,80,300,300);
        area.addKeyListener(this);
        f.add(lbl);
        f.add(area);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void keyReleased(KeyEvent e){
        String text = area.getText();
        String words[] = text.split("\\s");
        lbl.setText("Words: "+words.length+" Characters: "+text.length());
    }
     
    public static void main(String[] args) {
        // TODO code application logic here
        new KeyAdapterExample();
    }
    
}