package view;

import view.menu.LoggedInMenu;
import view.menu.NotLoggedInMenu;

import java.util.HashMap;

public class UserMenu extends Menu {
    public UserMenu(Menu parentMenu) {
        super("UserMenu", parentMenu);
        HashMap<Integer, Menu> subMenus = new HashMap<Integer, Menu>();
        subMenus.put(1, new LoggedInMenu(this));
        subMenus.put(2, new NotLoggedInMenu(this));
        this.setSubmenus(subMenus);
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public void execute() {
        super.execute();
    }
}
