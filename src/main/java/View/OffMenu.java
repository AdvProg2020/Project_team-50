package view;

import view.menu.SearchMenu;

import java.util.HashMap;

public class OffMenu extends Menu{
    public OffMenu(Menu parentMenu) {
        super("OffMenu", parentMenu);
        HashMap<Integer, Menu> subMenus = new HashMap<Integer, Menu>();
        subMenus.put(1, ListOfAuctionedGoodsMenu());
        subMenus.put(2, new SearchMenu(this));
    }

    private Menu ListOfAuctionedGoodsMenu() {
     return new Menu("ListOfAuctionedGoods", this) {
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
