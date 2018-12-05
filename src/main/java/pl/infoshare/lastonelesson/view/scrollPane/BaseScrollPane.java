package pl.infoshare.lastonelesson.view.scrollPane;

import javax.swing.*;

public abstract class BaseScrollPane extends JScrollPane {

        public BaseScrollPane() {
            initComponents();
            addComponents();
            configureComponent();
            setVisible(true);
        }

        abstract void configureComponent();
        abstract void addComponents();
        abstract void initComponents();
}
