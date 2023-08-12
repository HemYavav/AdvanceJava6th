package LabReport.LAB1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class SwingMenuExample extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    private JMenu fileMenu, editMenu, helpMenu;
    private JMenuItem cutItem, copyItem, pasteItem, readOnlyItem, insertItem, overtypeItem;

    public SwingMenuExample() {
        setTitle("Swing Menu Example");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        menuBar = new JMenuBar();

        // File Menu
        fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        // Edit Menu
        editMenu = new JMenu("Edit");
        cutItem = new JMenuItem("Cut");
        cutItem.setIcon(new ImageIcon("cut_icon.png"));
        copyItem = new JMenuItem("Copy");

        pasteItem = new JMenuItem("Paste");
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        // Sub-menu "Option" with icons
        JMenu optionMenu = new JMenu("Option");
        optionMenu.setIcon(new ImageIcon("option_icon.png", null));  // Replace with your icon file path
        readOnlyItem = new JMenuItem("Read-only");
        readOnlyItem.setIcon(new ImageIcon("read_only_icon.png"));  // Replace with your icon file path
        insertItem = new JMenuItem("Insert");
        insertItem.setIcon(new ImageIcon("insert_icon.png"));  // Replace with your icon file path
        overtypeItem = new JMenuItem("Overtype");
        overtypeItem.setIcon(new ImageIcon("overtype_icon.png"));  // Replace with your icon file path
        optionMenu.add(readOnlyItem);
        optionMenu.add(insertItem);
        optionMenu.add(overtypeItem);

        editMenu.addSeparator();
        editMenu.add(optionMenu);

        menuBar.add(editMenu);

        // Help Menu
        helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);
        cutItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        copyItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        pasteItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
        readOnlyItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        insertItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK));
        overtypeItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));

        cutItem.addActionListener(this);
        copyItem.addActionListener(this);
        pasteItem.addActionListener(this);
        readOnlyItem.addActionListener(this);
        insertItem.addActionListener(this);
        overtypeItem.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle menu item actions here
        JOptionPane.showMessageDialog(this, "Action performed: " + e.getActionCommand());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SwingMenuExample example = new SwingMenuExample();
            example.setVisible(true);
        });
    }
}
