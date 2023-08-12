package LabReport.LAB1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleInterestCalculator extends JFrame {
    private JTextField principalField, rateField, timeField, resultField;

    public SimpleInterestCalculator() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Simple Interest Calculator");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Using null layout

        JLabel principalLabel = new JLabel("Principal:");
        principalLabel.setBounds(20, 20, 80, 20);
        add(principalLabel);

        principalField = new JTextField();
        principalField.setBounds(110, 20, 150, 20);
        add(principalField);

        JLabel rateLabel = new JLabel("Rate (%):");
        rateLabel.setBounds(20, 50, 80, 20);
        add(rateLabel);

        rateField = new JTextField();
        rateField.setBounds(110, 50, 150, 20);
        add(rateField);

        JLabel timeLabel = new JLabel("Time (years):");
        timeLabel.setBounds(20, 80, 80, 20);
        add(timeLabel);

        timeField = new JTextField();
        timeField.setBounds(110, 80, 150, 20);
        add(timeField);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(20, 120, 100, 30);
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateSimpleInterest();
            }
        });
        add(calculateButton);

        JLabel resultLabel = new JLabel("Simple Interest:");
        resultLabel.setBounds(20, 160, 100, 20);
        add(resultLabel);

        resultField = new JTextField();
        resultField.setBounds(120, 160, 140, 20);
        resultField.setEditable(false);
        add(resultField);
    }

    private void calculateSimpleInterest() {
        try {
            double principal = Double.parseDouble(principalField.getText());
            double rate = Double.parseDouble(rateField.getText());
            double time = Double.parseDouble(timeField.getText());

            double simpleInterest = (principal * rate * time) / 100;
            resultField.setText(Double.toString(simpleInterest));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimpleInterestCalculator().setVisible(true);
            }
        });
    }
}
