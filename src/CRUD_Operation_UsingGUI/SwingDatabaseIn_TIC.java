package CRUD_Operation_UsingGUI;


import javax.swing.*;

class SwingDatabase
{
    JFrame jframe;
    JLabel lbl1, lbl2, lbl3;
    JTextField txt1, txt2, txt3;
    JButton insert, update, delete, view;
    
    public SwingDatabase()
    {
            jframe=new JFrame("Student_Info System");
            
            lbl1=new JLabel("Student Id:");
            lbl1.setBounds(20, 12, 100, 10);
            jframe.add(lbl1);
            txt1=new JTextField();
            txt1.setBounds(120, 10, 150, 20);
            jframe.add(txt1);
            
            lbl2=new JLabel("Student Name:");
            lbl2.setBounds(20, 55, 100, 10);
            jframe.add(lbl2);
            txt2=new JTextField();
            txt2.setBounds(120, 50, 150, 20);
            jframe.add(txt2);
            
            lbl3=new JLabel("Student Age: ");
            lbl3.setBounds(20,85,120,30);
            jframe.add(lbl3);
            txt3=new JTextField();
            txt3.setBounds(120, 90, 150, 20);
            jframe.add(txt3);
            
            insert=new JButton("Insert");
            insert.setBounds(10, 140, 80, 20);
            jframe.add(insert);
            
            update=new JButton("Update");
            update.setBounds(100, 140, 80, 20);
            jframe.add(update);
            
            delete=new JButton("Delete");
            delete.setBounds(200, 140, 80, 20);
            jframe.add(delete);
            
            view=new JButton("View");
            view.setBounds(300, 140, 80, 20);
            jframe.add(view);
               
            jframe.setLayout(null);
            jframe.setSize(700, 200);
            jframe.setLocationRelativeTo(null);
            jframe.setVisible(true);
            jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


public class SwingDatabaseIn_TIC {
    public static void main(String[] args) {
        new SwingDatabase();
        
    }  
}
