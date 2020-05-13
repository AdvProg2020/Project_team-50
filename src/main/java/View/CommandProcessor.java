package view;

import java.util.Scanner;

public class CommandProcessor {
    private static final Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            String command = scanner.nextLine().trim();
            if (ConsoleCommands.EXIT.getStringMatcher(command).matches()) {
                break;
            } else if (ConsoleCommands.REGISTER.getStringMatcher(command).matches()) {
                //TODO
            } else if (ConsoleCommands.LOGIN.getStringMatcher(command).matches()) {
                //TODO
            } else if (ConsoleCommands.VIEW_MANAGER_PERSONAL_INFO.getStringMatcher(command).matches()) {
                //TODO
            } else if (ConsoleCommands.EDIT_MANAGER_PERSONAL_INFO.getStringMatcher(command).matches()) {
                //TODO
            } else if (ConsoleCommands.MANAGING.getStringMatcher(command).matches()) {
                //TODO
            } else if (ConsoleCommands.VIEW_USER.getStringMatcher(command).matches()) {
                //TODO
            } else if (ConsoleCommands.DELETE_USER.getStringMatcher(command).matches()) {
                //TODO
            } else if (ConsoleCommands.MANAGER_PROFILE.getStringMatcher(command).matches()) {
                //TODO
            } else if (ConsoleCommands.MANAGE_PRODUCTS.getStringMatcher(command).matches()) {
                //TODO
            } else if (ConsoleCommands.REMOVE_PRODUCTS.getStringMatcher(command).matches()) {
                //TODO
            }
        }
    }
}
