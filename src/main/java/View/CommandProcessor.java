package view;

import java.util.Scanner;
import java.util.regex.Matcher;

public class CommandProcessor {
    private static final Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            String command = scanner.nextLine().trim();
            if (ConsoleCommands.EXIT.getStringMatcher(command).matches()) {
                break;
            } else if (ConsoleCommands.REGISTER.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.REGISTER.getStringMatcher(command);
                if (matcher.find()) {
                    //TODO
                }
            } else if (ConsoleCommands.LOGIN.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.LOGIN.getStringMatcher(command);
                if (matcher.find()) {
                    //TODO
                }
            } else if (ConsoleCommands.VIEW_MANAGER_PERSONAL_INFO.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.VIEW_MANAGER_PERSONAL_INFO.getStringMatcher(command);
                if (matcher.find()) {
                    //TODO
                }
            } else if (ConsoleCommands.EDIT_MANAGER_PERSONAL_INFO.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.EDIT_MANAGER_PERSONAL_INFO.getStringMatcher(command);
                if (matcher.find()) {
                    //TODO
                }
            } else if (ConsoleCommands.MANAGING.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.MANAGING.getStringMatcher(command);
                if (matcher.find()) {
                    //TODO
                }
            } else if (ConsoleCommands.VIEW_USER.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.VIEW_USER.getStringMatcher(command);
                if (matcher.find()) {
                    //TODO
                }
            } else if (ConsoleCommands.DELETE_USER.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.DELETE_USER.getStringMatcher(command);
                if (matcher.find()) {
                    //TODO
                }
            }
        }
    }
}
