package LabReport.LAB1;

/*
5(d) Create a MenuBar with Some Menus and Menuitems using Swing and Event.
*/

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

class MenuBarDemo {

    JMenuBar menubar;
    JMenu file, edit, help;
    JMenuItem cutItem, copyItem, pasteItem;
    JFrame frame;

    public MenuBarDemo() {
        frame = new JFrame("Demo of MenuBar");
        menubar = new JMenuBar();
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);

        //Adding menu or submenu
        file = new JMenu("File");
//        file.setMnemonic(KeyEvent.VK_F);
        menubar.add(file);
        edit = new JMenu("Edit");
//        edit.setMnemonic(KeyEvent.VK_E);
        menubar.add(edit);
        help = new JMenu("Help");
        menubar.add(help);

        cutItem = new JMenuItem("Cut");
        edit.add(cutItem);
        copyItem = new JMenuItem("Copy");
        edit.add(copyItem);
        pasteItem = new JMenuItem("Paste");
        edit.add(pasteItem);
        edit.addSeparator();
        JMenu option = new JMenu("Option");
        edit.add(option);
        JCheckBoxMenuItem roi = new JCheckBoxMenuItem("Read-Only");
        option.add(roi);
        option.addSeparator();
        JRadioButtonMenuItem iI = new JRadioButtonMenuItem("Insert");
        JRadioButtonMenuItem ot = new JRadioButtonMenuItem("Overtype");
        option.add(iI);
        option.add(ot);

        //Setting menubar on frame
        frame.setJMenuBar(menubar);

        //Adding icon to JMenuItem
        ImageIcon newImg = new ImageIcon("images/cut.png");
        cutItem.setIcon(newImg);

        ImageIcon exitImg = new ImageIcon("images/exit24.png");
        copyItem.setIcon(exitImg);

        ImageIcon pasteImg = new ImageIcon("images/exit2.png");
        pasteItem.setIcon(pasteImg);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

public class MenuBarExample {

    public static void main(String[] args) {
        new MenuBarDemo();
    }

}
