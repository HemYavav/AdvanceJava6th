package MouseClickListnerAndMotionListner;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JRadioButtonEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JRadioButton Event Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");
        JRadioButton radioButton3 = new JRadioButton("Option 3");
//Create a ButtonGroup that help to select a RadioButton at a time
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
      // Create a JLabel to display the selected option
        JLabel label = new JLabel();
        // Add an ActionListener to the radio buttons
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRadioButton radioButton = (JRadioButton) e.getSource();
                label.setText(radioButton.getText() + " selected");
            }
        };
        radioButton1.addActionListener(actionListener);
        radioButton2.addActionListener(actionListener);
        radioButton3.addActionListener(actionListener);
        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.add(radioButton3);
        frame.add(label);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}
