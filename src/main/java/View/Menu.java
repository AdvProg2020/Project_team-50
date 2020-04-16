package view;

import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    private String name;
    protected Menu parentMenu;
    protected HashMap<Integer, Menu> submenus;
    public static Scanner scanner;

    public Menu(String name, Menu parentMenu) {
        this.name = name;
        this.parentMenu = parentMenu;
    }

    public static void setScanner(Scanner scanner) {
        Menu.scanner = scanner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubmenus(HashMap<Integer, Menu> submenus) {
        this.submenus = submenus;
    }

    public void show(){
        //TODO
    }

    public void execute(){
        //TODO
    }
}
