package view.menu;

import view.Menu;

public class CategoryMenu extends Menu {
    public CategoryMenu(Menu parentMenu) {
        super("Category", parentMenu);
    }

    private Menu ListOfProductMenu() {
        return new Menu("ListOfProduct", this) {
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

    private Menu SearchMenu() {
        return new Menu("SearchMenu", this) {
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
