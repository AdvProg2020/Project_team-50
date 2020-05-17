package view;

import model.account.Admin;

public class RegistrationMenu extends Menu{
    public RegistrationMenu(Menu parentMenu) {
        super("RegistrationMenu", parentMenu);
        this.setSubmenus(subMenus);
    }

    public void register(String type, String userName){
        if (type.equalsIgnoreCase("Admin")) {
            controller.RegisterController registerController = null;
            registerController.registerAdmin();
        } else if (type.equalsIgnoreCase("Shopper")) {
            controller.RegisterController registerController = null;
            registerController.registerShopper();
        } else if (type.equalsIgnoreCase("Seller")) {
            controller.RegisterController registerController = null;
            registerController.registerSeller();
        }
    }
}
