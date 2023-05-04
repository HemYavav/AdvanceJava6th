package MouseClickListnerAndMotionListner;


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JCheckBoxEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JCheckBox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JCheckBox checkBox1 = new JCheckBox("Option 1");
        JCheckBox checkBox2 = new JCheckBox("Option 2");
        JCheckBox checkBox3 = new JCheckBox("Option 3");

        // Create a JLabel to display the selected options
        JLabel label = new JLabel();

        // Add an ItemListener to the check boxes
        ItemListener itemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String text = "";
                if (checkBox1.isSelected()) {
                    text += checkBox1.getText() + " Selected";
                }
                if (checkBox2.isSelected()) {
                    text += checkBox2.getText() + " Selected";
                }
                if (checkBox3.isSelected()) {
                    text += checkBox3.getText() + " Selected";
                }
                label.setText(text.trim());
            }
        };
        checkBox1.addItemListener(itemListener);
        checkBox2.addItemListener(itemListener);
        checkBox3.addItemListener(itemListener);

        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.add(checkBox3);
        frame.add(label);

        frame.setSize(350,100);
        frame.setVisible(true);
    }
}


    