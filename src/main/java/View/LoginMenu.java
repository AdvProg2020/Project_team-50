package view;

public class LoginMenu extends Menu {
    public LoginMenu(Menu parentMenu) {
        super("LoginMenu", parentMenu);
        this.setSubmenus(submenus);
    }

    private void register(String type, String userName){
        //TODO
    }

    private void login(String userName){
        //TODO after get username we must get password.
    }
}
