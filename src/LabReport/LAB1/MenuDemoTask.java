package LabReport.LAB1;

import javax.swing.*;
import java.awt.*;

public class MenuDemoTask {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();

        // Add the file menu
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        // Add the edit menu
        JMenu editMenu = new JMenu("Edit");
        menuBar.add(editMenu);

        // Add the cut, copy, and paste menu items to the edit menu
        JMenuItem cutMenuItem = new JMenuItem("Cut");
        cutMenuItem.setIcon(new ImageIcon("cut_icon.png"));
        editMenu.add(cutMenuItem);

        JMenuItem copyMenuItem = new JMenuItem("Copy");
        copyMenuItem.setIcon(new ImageIcon("img/copy.png"));
        editMenu.add(copyMenuItem);

        JMenuItem pasteMenuItem = new JMenuItem("Paste");
        pasteMenuItem.setIcon(new ImageIcon("img/paste.png"));
        editMenu.add(pasteMenuItem);

        // Add the option menu to the edit menu
        JMenu optionMenu = new JMenu("Option");
        editMenu.add(optionMenu);

        // Add the read-only and overtype menu items to the option menu
        JMenuItem readOnlyMenuItem = new JMenuItem("Read-only");
        readOnlyMenuItem.setIcon(new ImageIcon("img/read-only.png"));
        optionMenu.add(readOnlyMenuItem);
        
        JMenuItem InsertOnlyMenuItem = new JMenuItem("Insert");
        InsertOnlyMenuItem.setIcon(new ImageIcon("img/insert.png"));
        optionMenu.add(InsertOnlyMenuItem);

        JMenuItem overtypeMenuItem = new JMenuItem("Overtype");
        overtypeMenuItem.setIcon(new ImageIcon("img/overtype.png"));
        optionMenu.add(overtypeMenuItem);

        // Add the help menu
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);

        // Add the menu bar to the frame
        frame.setJMenuBar(menuBar);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
