package view;

import java.util.HashMap;

public class MainMenu extends Menu {

    public MainMenu() {
        super("MainMenu", null);
        HashMap<Integer, Menu> submenus = new HashMap<Integer, Menu>();
        submenus.put(1, new UserMenu(this));
        submenus.put(2, new ProductsMenu(this));
        submenus.put(3, new OffMenu(this));
        this.setSubmenus(submenus);
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
