package view.menu;

import view.Menu;

public class NotLoggedInMenu extends Menu {
    public NotLoggedInMenu(Menu parentMenu) {
        super("NotLoggedInMenu", parentMenu);
    }

    private Menu RegistrationPanelMenu() {
        return new Menu("RegistrationPanel", this) {
            @Override
            public void show() {
                super.show();
            }

            @Override
            public void execute() {
                super.execute();
            }
        };
    }
}
