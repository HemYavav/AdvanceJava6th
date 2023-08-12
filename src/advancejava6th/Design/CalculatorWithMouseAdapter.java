package advancejava6th.Design;

import java.awt.event.*;
import javax.swing.*;

class Calculator extends MouseAdapter {
    JLabel firstLabel, secondLabel, resultLabel;
    JTextField firstText, secondText, thirdText;
    JButton btnResult;
    JFrame frame;
    public Calculator()
    {
        frame = new JFrame();
        frame.setTitle("Simple Calculator");
        frame.setLayout(null);
        //Creaging objects for above components
        firstLabel = new JLabel("First number: ");
        firstText = new JTextField();
        secondLabel = new JLabel("Second number: ");
        secondText = new JTextField();
        resultLabel = new JLabel("Result: ");
        thirdText = new JTextField();
        thirdText.setEditable(false);
        btnResult = new JButton("RESULT");
       
        
        //Setting the boundary for the components of null layout
        firstLabel.setBounds(20,40,100,25);
        firstText.setBounds(150, 40, 165, 25);
        secondLabel.setBounds(20,70,100,25);
        secondText.setBounds(150,70,165,25);
        resultLabel.setBounds(20,100,100,25);
        thirdText.setBounds(150,100 ,165,25);
        btnResult.setBounds(20, 130, 100, 25);
        
      
        //Adding component to JFame
        frame.add(firstLabel); frame.add(firstText); frame.add(secondLabel);
        frame.add(secondText); frame.add(resultLabel); frame.add(thirdText);
        frame.add(btnResult); 
        
        
        //Adding buttons to event
        btnResult.addMouseListener(this);
        
        frame.setSize(350, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void mousePressed(MouseEvent e)
    {
        //Collecting data from swing component i.e. JTextField
        int num1 = Integer.parseInt(firstText.getText());
        int num2 = Integer.parseInt(secondText.getText());
        int result=0;
        //Capturing even of JButton btnAdd
        if(e.getSource()== btnResult)
        {
            result = num1 + num2;
        }
        //Setting or attaching the final result to thirdText
        thirdText.setText(String.valueOf(result));  
    }
    
    @Override
    public void mouseReleased(MouseEvent e)
    {
        //Collecting data from swing component i.e. JTextField
        int num1 = Integer.parseInt(firstText.getText());
        int num2 = Integer.parseInt(secondText.getText());
        int result=0;
        //Capturing even of JButton btnAdd
        if(e.getSource()== btnResult)
        {
            result = num1 - num2;
        }
        //Setting or attaching the final result to thirdText
        thirdText.setText(String.valueOf(result));  
    }
}
public class CalculatorWithMouseAdapter {
    public static void main(String[] args) {
       new Calculator();
    }
}