package view;

import view.menu.CategoryMenu;

import java.util.HashMap;

public class ProductsMenu extends Menu{

    public ProductsMenu(Menu parentMenu) {
        super("ProductsMenu", parentMenu);
        HashMap<Integer, Menu> subMenus = new HashMap<Integer, Menu>();
        subMenus.put(1, new CategoryMenu(this));
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
