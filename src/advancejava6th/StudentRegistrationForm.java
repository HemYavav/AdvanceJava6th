package advancejava6th;

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
    JLabel studentDetailHeading, nameJLabel, hobbiesJLabel, addressJLabel, courseJLabel, semesterJLabel, ageJLabel, sexJLabel;
    JTextField nameJField;
    JRadioButton maleJRadioButton, femaleJRadioButton;
    JButton btnSave, btnCancel;

    public RegistrationForm() {

        setTitle("Student Registration Form");
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

        nameJLabel = new JLabel("Name");
        nameJLabel.setBounds(25, 40, 70, 25);
        panel.add(nameJLabel);

        nameJField = new JTextField();
        nameJField.setBounds(100, 40, 200, 25);
        panel.add(nameJField);

        ageJLabel = new JLabel("Age");
        ageJLabel.setBounds(25, 70, 70, 25);
        panel.add(ageJLabel);

        Vector<Integer> ageList = new Vector<>();

        for (int i = 0; i <= 120; i++) {
            ageList.add(i);

        }

        JComboBox ageComboBox = new JComboBox(ageList);
        ageComboBox.setBounds(100, 70, 70, 25);
        panel.add(ageComboBox);

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

        List hobies = new List(3, true);
        hobies.add("Playing");
        hobies.add("Visiting");
        hobies.add("Reading");
        hobies.add("Swimming");
        hobies.add("Writting");
        hobies.add("Speaking");
        hobies.add("Announcing");
        hobies.add("Gossipping");

//                Choice hobbieChoice= new Choice(hobies);
        hobies.setBounds(105, 130, 100, 50);
        panel.add(hobies);

        add(panel);
        setVisible(true);

        addressJLabel = new JLabel("Address: ");
        addressJLabel.setBounds(25, 180, 70, 25);
        panel.add(addressJLabel);

        JTextArea commentsJTextArea = new JTextArea(5, 17);
        commentsJTextArea.setBounds(110, 190, 225, 120);
//        commentsJTextArea.scrollRectToVisible();
        commentsJTextArea.setBackground(Color.gray);

        panel.add(commentsJTextArea);

        courseJLabel = new JLabel("Course");
        courseJLabel.setBounds(25, 325, 70, 25);
        panel.add(courseJLabel);

        Choice courseArrayList = new Choice();
//ArrayList<String> courseArrayList = new ArrayList<String>();
        courseArrayList.add("Bsc. CSIT");
        courseArrayList.add("Bsc. AG");
        courseArrayList.add("Bsc. Science");
        courseArrayList.add("Bsc. IT");
        courseArrayList.add("BCA");
        courseArrayList.add("BALLB");

        courseArrayList.setBounds(110, 325, 120, 25);
        panel.add(courseArrayList);

        semesterJLabel = new JLabel("Semester");
        semesterJLabel.setBounds(25, 355, 70, 25);
        panel.add(semesterJLabel);

        Choice semesterChoice = new Choice();
        semesterChoice.add("1");
        semesterChoice.add("2");
        semesterChoice.add("3");
        semesterChoice.add("4");
        semesterChoice.add("5");
        semesterChoice.add("6");
        semesterChoice.add("7");
        semesterChoice.add("8");

        semesterChoice.setBounds(110, 355, 120, 25);
        panel.add(semesterChoice);

        btnSave = new JButton("Save");
        btnSave.setBackground(Color.blue);
        btnSave.setForeground(Color.WHITE);
        btnSave.setBounds(100, 395, 90, 25);
        panel.add(btnSave);

        btnCancel = new JButton("Cancel");
        btnCancel.setBounds(230, 395, 90, 25);
        btnCancel.setForeground(Color.white);
        btnCancel.setBackground(Color.red);
        panel.add(btnCancel);
    }
}
public class StudentRegistrationForm {

    public static void main(String[] args) {
        new RegistrationForm();
    }
}
