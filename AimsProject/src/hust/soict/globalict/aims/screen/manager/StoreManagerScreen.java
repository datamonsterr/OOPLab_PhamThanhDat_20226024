package hust.soict.globalict.aims.screen.manager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;

import hust.soict.globalict.aims.store.Store;

public class StoreManagerScreen extends JFrame {
    private Store store;

    public StoreManagerScreen() {

    }

    private JMenuBar createOptionsMenuBar() {
        JMenu menu = new JMenu("Options");
        menu.add(new JMenuItem("View Store"));
        JMenu updateMenu = new JMenu("Update Store");
        updateMenu.add(new JMenuItem("Add CD"));
        updateMenu.add(new JMenuItem("Add Book"));
        updateMenu.add(new JMenuItem("Add DVD"));
        menu.add(updateMenu);
        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout());
        menuBar.add(menu);

        return menuBar;
    }

    private JPanel createHeader(String text) {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
        JTextField headerText = new JTextField(text);
        headerText.setForeground(Color.CYAN);
        headerText.setFont(new Font(headerText.getFont().getName(), Font.PLAIN, 50));

        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(headerText);
        header.add(Box.createHorizontalGlue());
        header.add(Box.createRigidArea(new Dimension(10, 10)));
        return header;
    }
}
