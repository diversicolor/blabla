package pl.infoshare.lastonelesson.view.component.tabbedPane;

import pl.infoshare.lastonelesson.view.panel.tab.UserInfoTab;
import pl.infoshare.lastonelesson.view.panel.tab.UserListTab;

public class MainTabbedPane extends BaseTabbedPane {

    private UserInfoTab userInfoTab;
    private UserListTab userListTab;

    @Override
    void configureComponent() {

    }

    @Override
    void addComponents() {
        addTab(userInfoTab.getTitle(), userInfoTab);
        addTab(userListTab.getTitle(), userListTab);
    }

    @Override
    void initComponents() {
        userInfoTab = new UserInfoTab();
        userListTab = new UserListTab();
    }
}
