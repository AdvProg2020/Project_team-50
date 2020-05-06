package view;

public class CommandProcessor {
    public void StartWithMenus(){
        Menu.setScanner(Menu.scanner);
        Menu mainMenu = new MainMenu();
        mainMenu.show();
        mainMenu.execute();
    }
}
