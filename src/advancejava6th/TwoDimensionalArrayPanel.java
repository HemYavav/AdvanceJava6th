
import java.awt.*;
import javax.swing.*;

public class TwoDimensionalArrayPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Two-Dimensional Array Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a two-dimensional array of integers.
        int[][] array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = i * j;
            }
        }

        // Create a JPanel to display the array.
        JPanel panel = new JPanel();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                panel.add(new JLabel(String.valueOf(array[i][j])));
            }
        }

        // Add the JPanel to the JFrame.
        frame.add(panel);

        // Display the JFrame.
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
