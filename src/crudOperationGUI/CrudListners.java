package crudOperationGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CrudListners implements ActionListener {

    PageForm pageForm;

    public CrudListners(PageForm aThis) {
        this.pageForm = aThis;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
            String id = pageForm.sidField.getText();
            String name = pageForm.snameField.getText();
            String age = pageForm.sageField.getText();
            
        
        if (e.getSource() == pageForm.btnInterst) {
//            int id = Integer.parseInt(null);
//            int age = Integer.parseInt(null);
////            new Insert();
//            id = Integer.parseInt(pageForm.sidField.getText());

            if (id.equals("") || name.equals("") || age.equals("")) {
                JOptionPane.showMessageDialog(null, "Please Fill All Fields!!!");
            } else {

                InsertEncap ie = new InsertEncap();

                ie.setSid(Integer.parseInt(id));
                ie.setSname(name);
                ie.setSage(Integer.parseInt(age));
                new Insert(ie);
            }
       
            System.out.println("Insert");

            
            
            //
        } else if (e.getSource() == pageForm.btnUpdate) {
            
            
            if (id.equals("") || name.equals("") || age.equals("")) {
                  JOptionPane.showMessageDialog(null, "Please Fill All Fields!!!");
            } else {

                InsertEncap ie = new InsertEncap();

                ie.setSid(Integer.parseInt(id));
                ie.setSname(name);
                ie.setSage(Integer.parseInt(age));
                new Update(ie);
            }
            System.out.println("Update");
            
            
            //
        } else if (e.getSource() == pageForm.btnDelete) {
            
             if (id.equals("")) {
                  JOptionPane.showMessageDialog(null, "Please Fill ID Field to Delete Info!!!");
            } else {

                InsertEncap ie = new InsertEncap();

                ie.setSid(Integer.parseInt(id));
         
                new Delete(ie);
                            System.out.println("Delete");
            }
            
        } else if (e.getSource() == pageForm.btnView) {
//            System.out.println("View");


  if (id.equals("")) {
                  JOptionPane.showMessageDialog(null, "Please Fill ID Field to Delete Info!!!");
            } else {

                InsertEncap ie = new InsertEncap();

                ie.setSid(Integer.parseInt(id));
         
                new View(ie);
                            System.out.println("View");
            }
            
        }

    }

}
