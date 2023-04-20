package advancejava6th;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

class MenuDemo extends JFrame {

    public MenuDemo() {
        setTitle("Menu Task");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 150, 300, 400);
        setResizable(true);

//        It is not possible to set a menu bar in jpanel so we have to add this menu bar in frame
//        JPanel panel = new JPanel(null);
//                       MenuBar mbar = new MenuBar();
////        setMenuBar(mbar);
//        panel.add(setMenuBar(mbar));
//        
//        
        MenuBar mbar = new MenuBar();
        setMenuBar(mbar);

        Menu files = new Menu("Files");
        Menu date = new Menu("Date");
        Menu exit = new Menu("Exit");

        TextArea ta = new TextArea(10, 40);
        ta.setBackground(Color.CYAN);
        add(ta);

        mbar.add(files);
        mbar.add(date);
        mbar.add(exit);

        Menu mnew = new Menu("New");

        mnew.add(new MenuItem("Create File"));
        mnew.add(new MenuItem("Open Recent File"));
        mnew.add(new MenuItem("Remane"));
        mnew.add(new MenuItem("Copy"));
        mnew.add(new MenuItem("Paste"));

        files.add(mnew);

        MenuItem msave = new MenuItem("Save");
        MenuItem mopen = new MenuItem("Open");
        files.add(msave);
        files.add(mopen);

        files.addSeparator();
        MenuItem mprint = new MenuItem("Print");
        files.add(mprint);

        CheckboxMenuItem cmtoolbar = new CheckboxMenuItem("ToolBar");
        files.add(cmtoolbar);

        date.add(new MenuItem("Sunday"));
        date.add(new MenuItem("Monday"));

        MenuItem mexit = new MenuItem("Exit");

        exit.add(mexit);

        mexit.addActionListener((ActionListener) -> {
            Dialog dialog = new Dialog(this, "Model Dialog");

            Label label = new Label("Do want to exit!!", Label.CENTER);
            dialog.add(label);
            dialog.setVisible(true);
            dialog.setSize(300, 200);

//            JButton btnOk = new JButton("Ok");

        });

        setVisible(true);

    }

}

public class CheckBoxItemTask {

    public static void main(String[] args) {

        new MenuDemo();

    }
}
