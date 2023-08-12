package advancejava6th.Design;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;

class MenuBarDemo implements ActionListener
{
    JMenuBar menubar;
    JMenu file, edit, format, view, help;
    JMenuItem newItem, openItem, saveItem, exitItem;
    JMenuItem cutItem, copyItem, pasteItem;
    JFrame frame;
    JTextArea area;
    public MenuBarDemo()
    {
        frame = new JFrame("Demo of MenuBar");
        menubar = new JMenuBar();
        frame.setSize(300,300);
        frame.setLocationRelativeTo(null);
        
        //Adding menu or submenu
        file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);
        menubar.add(file);
        edit = new JMenu("Edit");
        edit.setMnemonic(KeyEvent.VK_E);
        menubar.add(edit);
        format = new JMenu("Format");
        menubar.add(format);
        view = new JMenu("View");
        menubar.add(view);
        view.setMnemonic(KeyEvent.VK_V);
        help = new JMenu("Help");
        menubar.add(help);
        
        
        //Adding menuItems
        newItem = new JMenuItem("New");
        file.add(newItem);
        openItem = new JMenuItem("Open");
        file.add(openItem);
        //Adding separator from here
        file.addSeparator();
        saveItem = new JMenuItem("Save");
        file.add(saveItem);
        exitItem = new JMenuItem("Exit");
        file.add(exitItem);
        
        //Adding zoom submenu
        JMenu zoom = new JMenu("Zoom");
        JMenuItem zoomin, zoomout, status;
        view.add(zoom);
        zoomin = new JMenuItem("Zoom In");
        zoom.add(zoomin);
        zoomout = new JMenuItem("Zoom Out");
        zoom.add(zoomout);
        
        
        //Adding status to view menu
        JCheckBoxMenuItem statu = new JCheckBoxMenuItem("Status");
        view.add(statu);
//        status = new JMenuItem("Status");
//        view.add(status);
        
        //Adding JRadioButtonMenuItem in SubMenu
        JMenu extraMenu, genderSubMenu;
        extraMenu = new JMenu("Extra");
//        extraMenu.setMnemonic(KeyEvent.VK_X);
        extraMenu.setToolTipText("you are on extraMenu");
        menubar.add(extraMenu);
        
        //adding inside extramenu
        JMenuItem itemOfExtraMenu1, itemOfExtraMenu2;
        itemOfExtraMenu1 = new JMenuItem("One");
        extraMenu.add(itemOfExtraMenu1);
        itemOfExtraMenu2 = new JMenuItem("Two");
        extraMenu.add(itemOfExtraMenu2);
        
        genderSubMenu = new JMenu("Gender");
        extraMenu.add(genderSubMenu);
        
        //Adding JRadioButtonMenuITem to genderSubMenu
        JRadioButtonMenuItem maleItem = new JRadioButtonMenuItem("Male");
        var femaleItem = new JRadioButtonMenuItem("Female");
        var otherItem = new JRadioButtonMenuItem("Other");
        ButtonGroup grp = new ButtonGroup();
        grp.add(maleItem);
        grp.add(femaleItem);
        grp.add(otherItem);
        
        genderSubMenu.add(maleItem);
        genderSubMenu.add(femaleItem);
        genderSubMenu.add(otherItem);        
        
                
                
        //Setting menubar on frame
        frame.setJMenuBar(menubar);
        
        //Setting Accelator
newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        
        //Adding icon or image   to JMenuItem
        ImageIcon newImg = new ImageIcon("images/new.png");
        //newItem.setHorizontalTextPosition(SwingConstants.LEFT);
        newItem.setIcon(newImg);
        ImageIcon exitImg = new ImageIcon("images/exit24.png");
        exitItem.setIcon(exitImg);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Adding event
        exitItem.addActionListener(this);
        
        //Adding Toolbar
        JToolBar toolbar = new JToolBar();
        JButton newBtn = new JButton("New");
        JButton openBtn = new JButton("Open");
        JButton saveBtn = new JButton("Save");
        JButton exitBtn = new JButton("Exit");
        area = new JTextArea();
        
        toolbar.add(newBtn);
        toolbar.add(openBtn);
        toolbar.add(saveBtn);
        toolbar.add(exitBtn);
        
        frame.add(toolbar,BorderLayout.NORTH);
        frame.add(area,BorderLayout.CENTER);
        
        newItem.addActionListener(this);
        openItem.addActionListener(this);
    }
    
        
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==exitItem)
        {
            System.exit(0);
        }
        if(e.getSource()==newItem)
        {
            JOptionPane.showMessageDialog(frame,"You click New Item");
        }
        if(e.getSource()==openItem)
        {
            JOptionPane.showMessageDialog(frame,"You click New Item");
        }
    }
    
}


public class JMenuBarTIC {
    public static void main(String[] args) {
        
        new MenuBarDemo();
    }
}