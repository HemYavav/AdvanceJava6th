package advancejava6th;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TwoDimensionalObjectDisplay {
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Create a top-level container.
                JFrame frame = new JFrame("Two-Dimensional Object Display");

                // Add a JPanel to the top-level container.
                JPanel panel = new JPanel();
                frame.add(panel, BorderLayout.CENTER);

                // Create a two-dimensional array of JLabel objects.
                JLabel[][] labels = new JLabel[2][3];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 3; j++) {
                        labels[i][j] = new JLabel("Label " + i + ", " + j);
                    }
                }

                // Iterate over the two-dimensional array and add each object to the JPanel.
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 3; j++) {
                        panel.add(labels[i][j]);
                    }
                }

                // Set the layout manager of the JPanel to a layout manager that will arrange the objects in the array in the desired way.
                panel.setLayout(new GridLayout(2, 3));

                // Display the top-level container.
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setSize(400, 300);
                frame.setVisible(true);
            }
        });
    }
}


//******************************************************
