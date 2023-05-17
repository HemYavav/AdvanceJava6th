package crudOperationGUI;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JPanel;

class PageForm extends JFrame {

   public JPanel panel;

    public JLabel sid, sname, sage;
   public JTextField sidField, snameField, sageField;

  public  JButton btnUpdate, btnInterst, btnDelete, btnView;

    public PageForm() {
        setTitle("Student_Info System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(280, 180, 500, 400);
        panel = new JPanel(null);

        //Student ID
        sid = new JLabel("Student ID: ");
        sid.setBounds(35, 10, 80, 22);
        panel.add(sid);

        sidField = new JTextField();
        sidField.setBounds(120, 10, 150, 22);
        panel.add(sidField);

        // Student Name
        sname = new JLabel("Student Name: ");
        sname.setBounds(35, 40, 90, 22);
        panel.add(sname);

        snameField = new JTextField();
        snameField.setBounds(120, 40, 150, 22);
        panel.add(snameField);

        //Student Age
        sage = new JLabel("Student Age: ");
        sage.setBounds(35, 70, 80, 22);
        panel.add(sage);

        sageField = new JTextField();
        sageField.setBounds(120, 70, 150, 22);
        panel.add(sageField);
        
        
        //Button Insert
        btnInterst= new JButton("Insert");
        btnInterst.setBounds(35, 110, 75, 25);
        panel.add(btnInterst);
        
               //Button Update
        btnUpdate= new JButton("Update");
        btnUpdate.setBounds(125, 110, 75, 25);
        panel.add(btnUpdate);
        
               //Button 
        btnDelete= new JButton("Delete");
        btnDelete.setBounds(215, 110, 75, 25);
        panel.add(btnDelete);
        
               //Button 
        btnView= new JButton("View");
        btnView.setBounds(305, 110, 75, 25);
        panel.add(btnView);
        
        
        
        

        add(panel);
        setVisible(true);
        
        CrudListners listners = new CrudListners(this);
        btnInterst.addActionListener(listners);
        btnUpdate.addActionListener(listners);
        btnDelete.addActionListener(listners);
        btnView.addActionListener(listners);
        
        
//        Insert insert = new Insert();
        

            

    }

}

public class MainPage {

    public static void main(String[] args) {

        new PageForm();
    }

}
