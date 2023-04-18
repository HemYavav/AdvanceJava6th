
package advancejava6th;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import jdk.dynalink.Operation;


class DesignOperation extends JFrame implements KeyListener{
    
    JPanel paneJpanel;
    JLabel headings, firstNumberJLabel, secondNumberJLabel, resultJLabel;
    
    JTextField firstNumJTextField, secondNumJTextField,restultJTextField;
    
    JButton btnAdd, btSub, btnMul, btnDiv, btnClear;

    public DesignOperation() {
        setTitle("Two Number Operation Task");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);
        setResizable(false);
        setLocationRelativeTo(null);
        
        paneJpanel= new JPanel(null);
        
        headings = new JLabel("Operation");
        headings.setBounds(150,10,100,25);
    headings.setFont(headings.getFont().deriveFont(25,20.0f).deriveFont(Font.BOLD));
        paneJpanel.add(headings);
        
        
        firstNumberJLabel = new JLabel("First Number: ");
        firstNumberJLabel.setBounds(25,45,100,25);
        paneJpanel.add(firstNumberJLabel);
        
        firstNumJTextField = new JTextField(10);
        firstNumJTextField.setBounds(135,45,120,25);
        paneJpanel.add(firstNumJTextField);
        

        secondNumberJLabel = new JLabel("Second Number: ");
        secondNumberJLabel.setBounds(25,75,100,25);
        paneJpanel.add(secondNumberJLabel);
        
        secondNumJTextField = new JTextField(10);
        secondNumJTextField.setBounds(135,75,120,25);
        paneJpanel.add(secondNumJTextField);

        
                resultJLabel = new JLabel("Result: ");
        resultJLabel.setBounds(40,110,100,25);
        paneJpanel.add(resultJLabel);
        
        restultJTextField = new JTextField(15);
        restultJTextField.setBounds(125,110,135,25);
        paneJpanel.add(restultJTextField);
                
        
        btnAdd = new JButton("ADD");
        btnAdd.setBounds(25,150,70,25);
        btnAdd.addKeyListener(this);
        paneJpanel.add(btnAdd);
        
        
        
                btSub = new JButton("SUB");
        btSub.setBounds(100,150,70,25);
        paneJpanel.add(btSub);
        
        
                btnMul = new JButton("MUL");
        btnMul.setBounds(175,150,70,25);
        paneJpanel.add(btnMul);
        
        
                btnDiv = new JButton("ADD");
        btnDiv.setBounds(250,150,70,25);
        paneJpanel.add(btnDiv);
        
        
                     btnClear = new JButton("Clear");
        btnClear.setBounds(135,190,70,25);
        paneJpanel.add(btnClear);
        
        
        
        
        add(paneJpanel);
        
        setVisible(true);
    }
    
    
    

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
int num1, num2, res;

num1 = Integer.parseInt(firstNumJTextField.getText());
num2 = Integer.parseInt(secondNumJTextField.getText());

        if ("ADD".equals(e.getSource().toString())) {
            
            res = num1+num2;
            restultJTextField.setText(""+res);
        }
        
        
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
  
    
   



}

public class TwoNumberOperationTask {
    public static void main(String[] args) {
     new  DesignOperation();
    }
    
}
