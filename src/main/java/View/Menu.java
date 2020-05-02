package view;

import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    private String name;
    protected Menu parentMenu;
    protected HashMap<Integer, Menu> subMenus;
    protected static Scanner scanner;

    public Menu(String name, Menu parentMenu) {
        this.name = name;
        this.parentMenu = parentMenu;
    }

    public String getName() {
        return name;
    }

    public static void setScanner(Scanner scanner) {
        Menu.scanner = scanner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubmenus(HashMap<Integer, Menu> submenus) {
        this.subMenus = submenus;
    }

    public void show(){
        System.out.println(this.name + ":");
        for (Integer menuNumber : subMenus.keySet()) {
            System.out.println(menuNumber + "-" + subMenus.get(menuNumber).getName());
        }
        if (this.parentMenu != null) {
            System.out.println((this.subMenus.size() + 1) + "-Back");
        } else {
            System.out.println((this.subMenus.size() + 1) + "-Exit");
        }
    }

    public void execute(){
        Menu nextMenu = null;
        int input = Integer.parseInt(scanner.nextLine());
        if (input == this.subMenus.size() + 1) {
            if (this.parentMenu == null) {
                System.exit(1);
            } else {
                nextMenu = this.parentMenu;
            }
        } else {
            nextMenu = subMenus.get(input);
        }
        nextMenu.show();
        nextMenu.execute();
    }
}
