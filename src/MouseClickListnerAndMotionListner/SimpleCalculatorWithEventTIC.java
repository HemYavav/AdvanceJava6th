package MouseClickListnerAndMotionListner;


import java.awt.event.*;
import javax.swing.*;

class Calculator extends JFrame implements ActionListener{
    JLabel lblMsg, firstLabel, secondLabel, resultLabel;
    JTextField firstText, secondText, thirdText;
    JButton btnAdd, btnSub, btnProd, btnDiv;
    
    public Calculator()
    {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        lblMsg = new JLabel("Simple Arithmetic Calculator");
        lblMsg.setBounds(100, 10, 200, 25);
        add(lblMsg);
        //Creaging objects for above components
        firstLabel = new JLabel("First number: ");
        firstText = new JTextField();
        secondLabel = new JLabel("Second number: ");
        secondText = new JTextField();
        resultLabel = new JLabel("Result: ");
        thirdText = new JTextField();
        thirdText.setEditable(false);
        btnAdd = new JButton("ADD");
        btnSub = new JButton("SUB");
        btnProd = new JButton("PROD");
        btnDiv = new JButton("DIV");
        
        //Setting the boundary for the components of null layout
        firstLabel.setBounds(20,40,100,25);
        firstText.setBounds(150, 40, 165, 25);
        secondLabel.setBounds(20,70,100,25);
        secondText.setBounds(150,70,165,25);
        resultLabel.setBounds(20,100,100,25);
        thirdText.setBounds(150,100 ,165,25);
        btnAdd.setBounds(20, 130, 70, 25);
        btnSub.setBounds(95, 130, 70, 25);
        btnProd.setBounds(170,130,70,25);
        btnDiv.setBounds(245,130,70,25);
      
        //Adding event
        btnAdd.addActionListener(this);
        btnSub.addActionListener(this);
        btnProd.addActionListener(this);
        btnDiv.addActionListener(this);
        
        //Adding component to JFame
        add(firstLabel); add(firstText); add(secondLabel);
        add(secondText); add(resultLabel); add(thirdText);
        add(btnAdd); add(btnSub); add(btnProd); add(btnDiv);
        
        setSize(350, 200);
        setLocationRelativeTo(null);
        setVisible(true);  
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        int a = Integer.parseInt(firstText.getText());
        int b = Integer.parseInt(secondText.getText());
        
        if(e.getSource()==btnAdd)
        {
            float sum = (a + b);
            thirdText.setText(String.valueOf(sum));
        }
        if(e.getSource()==btnSub)
        {
            int s = a - b;
            thirdText.setText(String.valueOf(s));
        }   
        
        if(e.getSource()==btnProd)
        {
            int p = a * b;
            thirdText.setText(String.valueOf(p));
        } 
        
        if(e.getSource()==btnDiv)
        {
            float d = (float)a/b;
            thirdText.setText(String.valueOf(d));
        } 
    }

 
}
public class SimpleCalculatorWithEventTIC {
    public static void main(String[] args) {
       new Calculator();
    }
}

