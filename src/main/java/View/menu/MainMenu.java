package view.menu;

import View.menu.Menu;

import java.util.HashMap;

public class MainMenu extends View.menu.Menu {

    public MainMenu() {
        super("MainMenu", null);
    }
    HashMap<Integer, Menu> subMenus = new HashMap<Integer, Menu>();

}
