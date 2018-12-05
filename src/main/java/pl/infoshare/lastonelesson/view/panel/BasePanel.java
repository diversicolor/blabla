package pl.infoshare.lastonelesson.view.panel;

import javax.swing.*;

public abstract class BasePanel extends JPanel{

    public BasePanel() {
        initComponents();
        addComponents();
        configureComponent();
    }
    protected abstract void configureComponent();
    protected abstract void addComponents();
    protected abstract void initComponents();
}

