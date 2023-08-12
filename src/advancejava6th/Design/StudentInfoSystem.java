package advancejava6th.Design;

import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.*;

class Student extends JFrame implements ActionListener {

    JLabel sId, sName, sAge;
    JTextField id, name, age;
    JButton btnInsert, btnUpdate, btnDelete, btnView;

    public Student() {
        setTitle("Student_info System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        sId = new JLabel("Student id: ");
        id = new JTextField();
        sName = new JLabel("Student Name: ");
        name = new JTextField();
        sAge = new JLabel("Student Age: ");
        age = new JTextField();
        btnInsert = new JButton("Insert");
        btnUpdate = new JButton("Update");
        btnDelete = new JButton("Delete");
        btnView = new JButton("View");
        sId.setBounds(20, 20, 100, 25);
        id.setBounds(150, 20, 165, 25);
        sName.setBounds(20, 50, 100, 25);
        name.setBounds(150, 50, 165, 25);
        sAge.setBounds(20, 80, 100, 25);
        age.setBounds(150, 80, 165, 25);
        btnInsert.setBounds(20, 130, 90, 25);
        btnUpdate.setBounds(95, 130, 90, 25);
        btnDelete.setBounds(170, 130, 90, 25);
        btnView.setBounds(245, 130, 90, 25);
        btnInsert.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnDelete.addActionListener(this);
        btnView.addActionListener(this);
        add(sId);
        add(id);
        add(sName);
        add(name);
        add(sAge);
        add(age);
        add(btnInsert);
        add(btnUpdate);
        add(btnDelete);
        add(btnView);
        setSize(380, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody    }

    }

    public class StudentInfoSystem {

        public static void main(String[] args) {
            new Student();
        }
    
}
}
