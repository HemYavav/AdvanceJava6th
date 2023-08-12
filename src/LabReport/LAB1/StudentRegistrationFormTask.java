package LabReport.LAB1;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.List;
import java.util.*;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.*;

class RegistrationForm extends JFrame {

    JPanel panel;
    JLabel studentDetailHeading, usernameJLabel, hobbiesJLabel, commentsJLabel, courseJLabel, semesterJLabel, ageJLabel, sexJLabel;
    JTextField nameJField;
    JRadioButton maleJRadioButton, femaleJRadioButton;
    JButton btnSubmit, btnCancel;

    public RegistrationForm() {

        setTitle("GUI Control Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBounds(400, 100, 400, 500);
//        setSize(400, 550);
        setResizable(false);

        panel = new JPanel(null);

        studentDetailHeading = new JLabel("Student Details");
        studentDetailHeading.setBounds(150, 10, 150, 30);
        studentDetailHeading.setFont(studentDetailHeading.getFont().deriveFont(20).deriveFont(Font.BOLD));
        panel.add(studentDetailHeading);

        usernameJLabel = new JLabel("Username");
        usernameJLabel.setBounds(25, 40, 70, 25);
        panel.add(usernameJLabel);

        nameJField = new JTextField();
        nameJField.setBounds(100, 40, 200, 25);
        panel.add(nameJField);

        JLabel passwordJLabel = new JLabel("Password");
        passwordJLabel.setBounds(25, 70, 70, 25);
        panel.add(passwordJLabel);

        JTextField passwordJField = new JTextField();
        passwordJField.setBounds(100, 70, 200, 25);
        panel.add(passwordJField);

        sexJLabel = new JLabel("Sex(M/F): ");
        sexJLabel.setBounds(25, 100, 70, 25);
        panel.add(sexJLabel);

        maleJRadioButton = new JRadioButton("Male");
        maleJRadioButton.setBounds(85, 100, 60, 25);
        panel.add(maleJRadioButton);

        femaleJRadioButton = new JRadioButton("Female");
        femaleJRadioButton.setBounds(160, 100, 70, 25);
        panel.add(femaleJRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(maleJRadioButton);
        buttonGroup.add(femaleJRadioButton);

        hobbiesJLabel = new JLabel("Hobbies");
        hobbiesJLabel.setBounds(25, 130, 70, 25);
        panel.add(hobbiesJLabel);

        List hobies = new List(4, true);
        hobies.add("Playing");
        hobies.add("Visiting");
        hobies.add("Reading");
        hobies.add("Swimming");

//                Choice hobbieChoice= new Choice(hobies);
        hobies.setBounds(105, 130, 100, 50);
        panel.add(hobies);

        add(panel);
        setVisible(true);

        JLabel selectCountryJLabel = new JLabel("Select Country: ");
        selectCountryJLabel.setBounds(25, 190, 110, 25);
        panel.add(selectCountryJLabel);

        Choice selectCountryChoice = new Choice();
        selectCountryChoice.add("Nepal");
        selectCountryChoice.add("India");
        selectCountryChoice.add("China");
        selectCountryChoice.add("Bangladesh");
        selectCountryChoice.add("United States");
        selectCountryChoice.add("United Kingdom");
        selectCountryChoice.add("Canada");
        selectCountryChoice.add("Australia");
        selectCountryChoice.add("Japan");
        selectCountryChoice.setBounds(150, 190, 120, 25);
        panel.add(selectCountryChoice);

        commentsJLabel = new JLabel("Comments: ");
        commentsJLabel.setBounds(25, 220, 70, 25);
        panel.add(commentsJLabel);

        JTextArea commentsJTextArea = new JTextArea(5, 17);
        commentsJTextArea.setBounds(110, 230, 225, 115);
//        commentsJTextArea.scrollRectToVisible();
        commentsJTextArea.setBackground(Color.gray);
        panel.add(commentsJTextArea);

        btnSubmit = new JButton("Submit");
        btnSubmit.setBackground(Color.blue);
        btnSubmit.setForeground(Color.WHITE);
        btnSubmit.setBounds(120, 370, 90, 25);
        panel.add(btnSubmit);

    }
}

public class StudentRegistrationFormTask {

    public static void main(String[] args) {
        new RegistrationForm();
    }
}
