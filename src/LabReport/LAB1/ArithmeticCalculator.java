package LabReport.LAB1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArithmeticCalculator extends JFrame implements ActionListener {
    private JTextField num1, num2, resultField;
    private JButton btnAdd, btnSub, btnMul, btnDiv;
    

    public ArithmeticCalculator() {
        setTitle("Arithmetic Calculator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        num1 = new JTextField(20);
        num2 = new JTextField(20);
        resultField = new JTextField(20);
        resultField.setEditable(false);

        btnAdd = new JButton("Add");
        btnSub = new JButton("Subtract");
        btnMul = new JButton("Multiply");
        btnDiv = new JButton("Divide");

        btnAdd.addActionListener(this);
        btnSub.addActionListener(this);
        btnMul.addActionListener(this);
        btnDiv.addActionListener(this);

        add(new JLabel("Number 1:"));
        add(num1);
        add(new JLabel("Number 2:"));
        add(num2);
        add(new JLabel("Result:"));
        add(resultField);
        add(btnAdd);
        add(btnSub);
        add(btnMul);
        add(btnDiv);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(this.num1.getText());
        double num2 = Double.parseDouble(this.num2.getText());
        double result = 0;

        if (e.getSource() == btnAdd) {
            result = num1 + num2;
        } else if (e.getSource() == btnSub) {
            result = num1 - num2;
        } else if (e.getSource() == btnMul) {
            result = num1 * num2;
        } else if (e.getSource() == btnDiv) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                JOptionPane.showMessageDialog(this, "Cannot divide by zero!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        resultField.setText(Double.toString(result));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ArithmeticCalculator());
    }
}
