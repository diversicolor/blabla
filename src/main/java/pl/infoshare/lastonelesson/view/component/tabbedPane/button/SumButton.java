package pl.infoshare.lastonelesson.view.component.tabbedPane.button;

import pl.infoshare.lastonelesson.view.panel.tab.UserInfoTab;

import javax.swing.*;
import java.awt.*;

public class SumButton extends JButton {

    private static final String LABEL = "SUM";

    private Component parent;

    public SumButton(Component parent) {
        super(LABEL);
        this.parent = parent;

        addActionListener(e -> {
            UserInfoTab component = (UserInfoTab) parent;

        });
    }
}
