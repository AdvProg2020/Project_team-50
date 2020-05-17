package view;

import java.util.HashMap;

public class LoginMenu extends Menu {
    public LoginMenu(Menu parentMenu) {
        super("LoginMenu", parentMenu);
        HashMap<Integer, Menu> submenus = new HashMap<Integer, Menu>();
        submenus.put(1, new RegistrationMenu(this));
        this.setSubmenus(submenus);
    }

    public void login(String userName){
        controller.EntryController entryController = null;
        entryController.logIn();
    }
}
