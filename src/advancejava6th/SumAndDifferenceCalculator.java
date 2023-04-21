package advancejava6th;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SumAndDifferenceCalculator extends JFrame implements MouseListener {

    private JTextField inputField1, inputField2, outputField;

    public SumAndDifferenceCalculator() {
        setTitle("Sum and Difference Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);

        // Create the input fields for the two numbers
        inputField1 = new JTextField(10);
        inputField2 = new JTextField(10);

        // Create the output field
        outputField = new JTextField(10);
        outputField.setEditable(false);

        // Create the button and add a mouse listener to it
        JButton button = new JButton("Calculate");
        button.addMouseListener(this);

        // Create a panel to hold the input fields, button, and output field
        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter first number:"));
        panel.add(inputField1);
        panel.add(new JLabel("Enter second number:"));
        panel.add(inputField2);
        panel.add(button);
        panel.add(new JLabel("Result:"));
        panel.add(outputField);

        // Add the panel to the frame
        add(panel);

        // Set the frame to be visible
        setVisible(true);
    }

    // MouseListener methods
    public void mouseClicked(MouseEvent e) {
        int num1 = Integer.parseInt(inputField1.getText());
        int num2 = Integer.parseInt(inputField2.getText());
        int sum = num1 + num2;
        outputField.setText(Integer.toString(sum));
    }

    public void mouseEntered(MouseEvent e) {
        
        // Not used in this program
    }

    public void mouseExited(MouseEvent e) {
        // Not used in this program
    }

    public void mousePressed(MouseEvent e) {
        // Not used in this program
    }

    public void mouseReleased(MouseEvent e) {
        int num1 = Integer.parseInt(inputField1.getText());
        int num2 = Integer.parseInt(inputField2.getText());
        int difference = num1 - num2;
        outputField.setText(Integer.toString(difference));
    }

    public static void main(String[] args) {
        new SumAndDifferenceCalculator();
    }
}
