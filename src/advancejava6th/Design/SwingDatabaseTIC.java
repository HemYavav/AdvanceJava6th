package advancejava6th.Design;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import static java.time.Clock.system;
import java.util.Scanner;
import javax.swing.*;

class SwingDatabase implements ActionListener
{
    JFrame jframe;
    JLabel lbl1, lbl2, lbl3;
    JTextField txt1, txt2, txt3;
    JButton insert, update, delete, view;
    
     Connection conn = null;
     Statement stmt = null;
    
    public void ConnectionString(){
            
           
          try {
            //Step 2. Load and register the appropriate driver
            Class.forName("com.mysql.jdbc.Driver");
            //Step 3. Create or establish the connection
            String url = "jdbc:mysql://localhost:3306/triton_jdbc";
            String user="root";
            String pass = "";
            conn = DriverManager.getConnection(url, user,pass);
            //Step 4. Create a statment using above connection object
            stmt = conn.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
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
           
            insert.addActionListener(this);
            update.addActionListener(this);
            delete.addActionListener(this);
            view.addActionListener(this); 
            
            jframe.setLayout(null);
            jframe.setSize(700, 200);
            jframe.setLocationRelativeTo(null);
            jframe.setVisible(true);
            jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == insert){
            insertRecord();
        }
        else if (e.getSource() == update){
            updateRecord();
        }
        else if (e.getSource() == delete){
//            deleteRecord();
        }
        else if (e.getSource() == view){}
//            viewRecord();
    }
    public void insertRecord(){
        try{
             ConnectionString();
           
            int id = Integer.parseInt(txt1.getText());
            String name = txt2.getText();
            int age = Integer.parseInt(txt1.getText());
            
            //Step 5. Create and execute a query
            String insertQuery = "INSERT INTO student values(?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(insertQuery);
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setInt(3, age);
            int checkForInsert = pstmt.executeUpdate();
            if(checkForInsert>0)
            //Show the successfull message
               JOptionPane.showMessageDialog(jframe,"Record inserted successfully...");
            else
                JOptionPane.showMessageDialog(jframe,"Failed to insert record...");
             conn.close();
        } catch (SQLException e) {
        }
    }
    public void updateRecord(){
        try{
           ConnectionString();
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the id to update record: ");
            int id = Integer.parseInt(input.nextLine());
            System.out.println("Enter the name: ");
            String name = input.nextLine();
            System.out.println("Enter the age: ");
            int age = Integer.parseInt(input.nextLine());
            
            //Step 5. Create and execute a query
            String deleteQuery = "update student set sname='"+name+"',sage="+age+" where sid="+id;
            stmt = conn.createStatement();
            int checkForUpdate = stmt.executeUpdate(deleteQuery);
            if(checkForUpdate>0)
            //Show the successfull message
               System.out.println("Record updated successfully...");
            else
                System.out.println("Failed to update record...");
            conn.close();
        }catch(SQLException ex){
            System.out.println("Can't Insert");
    }
    }
}
   

public class SwingDatabaseTIC {
    public static void main(String[] args) {
        new SwingDatabase();
    }  
}