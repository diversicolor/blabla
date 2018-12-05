package pl.infoshare.lastonelesson.view.scrollPane;



import pl.infoshare.lastonelesson.view.component.tabbedPane.MainTabbedPane;



public class TabsScrollPanel extends BaseScrollPane {


        private MainTabbedPane mainTabbedPane;

        @Override
        public void configureComponent() {
        }

        @Override
        void addComponents() {
            add(mainTabbedPane);
        }

        @Override
        void initComponents() {
            mainTabbedPane = new MainTabbedPane();
        }
}
