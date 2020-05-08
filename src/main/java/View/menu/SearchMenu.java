package view.menu;

import view.Menu;

public class SearchMenu extends Menu {
    public SearchMenu(Menu parentMenu) {
        super("Search", parentMenu);
    }

    private Menu GeneralFeaturesMenu() {
        return new Menu("GeneralFeatures", this) {
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

    private Menu CategoryFeaturesMenu() {
        return new Menu("CategoryFeatures", this) {
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
