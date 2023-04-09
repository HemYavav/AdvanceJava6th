package advancejava6th;

import java.awt.Color;
import java.awt.Font;
import java.util.Vector;
import javax.swing.ComboBoxEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicComboBoxEditor;

class RegisterForm extends JFrame {

    JPanel panel;
    JLabel headings;

    JLabel usernameJLabel, passwordlaJLabel, genderJLabel, hobbiesJLabel, selectCountryJLabel, commentsJLabel;
    JTextField usernameTxt, passwordTxt;
    JRadioButton maleJRadioButton, femaleJRadioButton;
    JTextArea textArea;
    JButton btnSubmit ,btnCancel;

    public RegisterForm() {

        setTitle("GUI control fro Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 450);
        setResizable(false);
        setLocationRelativeTo(null);

//        setLayout(null);
        panel = new JPanel(null);

        headings = new JLabel("Register Form");
        headings.setBounds(120, 10, 150, 30);
        headings.setFont(headings.getFont().deriveFont(18.0f).deriveFont(Font.BOLD));
        panel.add(headings);

        usernameJLabel = new JLabel("Username: ");
        usernameJLabel.setBounds(25, 50, 70, 22);
        panel.add(usernameJLabel);

        usernameTxt = new JTextField();
        usernameTxt.setBounds(100, 50, 180, 22);
        panel.add(usernameTxt);

        passwordlaJLabel = new JLabel("Password: ");
        passwordlaJLabel.setBounds(25, 80, 70, 22);
        panel.add(passwordlaJLabel);

        usernameTxt = new JTextField();
        usernameTxt.setBounds(100, 80, 180, 22);
        panel.add(usernameTxt);

        //
        genderJLabel = new JLabel("Gneder: ");
        genderJLabel.setBounds(25, 110, 60, 22);
        panel.add(genderJLabel);

        maleJRadioButton = new JRadioButton("Male");
        maleJRadioButton.setBounds(75, 110, 60, 25);
        panel.add(maleJRadioButton);

        femaleJRadioButton = new JRadioButton("Female");
        femaleJRadioButton.setBounds(160, 110, 70, 25);
        panel.add(femaleJRadioButton);

        //
        selectCountryJLabel = new JLabel("Select Country: ");
        selectCountryJLabel.setBounds(25, 140, 100, 22);
        panel.add(selectCountryJLabel);

        Vector<String> countryList = new Vector<>();
        countryList.add("Nepal");
        countryList.add("India");
        countryList.add("China");
        countryList.add("United State of America");
        countryList.add("Bangladesh");
        countryList.add("Maldevies");
        countryList.add("Australia");
        JComboBox selectCountryComboBox = new JComboBox(countryList);
        selectCountryComboBox.setBounds(130, 140, 180, 22);
        panel.add(selectCountryComboBox);


        //
                commentsJLabel = new JLabel("Comments: ");
        commentsJLabel.setBounds(25, 170, 100, 22);
        panel.add(commentsJLabel);

        JTextArea commentsJTextArea = new JTextArea(8, 10);
        commentsJTextArea.setBounds(130, 180, 200, 150);
        panel.add(commentsJTextArea);

                btnSubmit = new JButton("Submit");
                btnSubmit.setBackground(Color.blue);
        btnSubmit.setBounds(100, 350, 90, 25);
        panel.add(btnSubmit);
        
        btnCancel = new JButton("Cancel");
        btnCancel.setBounds(230, 350, 90, 25);
        panel.add(btnCancel);




        
        add(panel);
        setVisible(true);

    }

}

public class GUIControls {

    public static void main(String[] args) {

        new RegisterForm();

    }

}
