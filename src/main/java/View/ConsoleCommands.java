package view;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum ConsoleCommands {
    LOGIN("(?i)login\\s+(\\w+)"),
    REGISTER("(?i)create\\s+account\\s+(\\w+)\\s+(\\w+)"),
    USER_MENU("(?i)view\\s+personal\\s+info"),
    VIEW_PERSONAL_INFO("(?i)view\\s+personal\\s+info"),
    EDIT_PERSONAL_INFO("(?i)edit\\s+(\\w+)"),
    MANAGER("(?i)manage\\s+users"),
    VIEW("(?i)view\\s+(\\w+)"),
    DELETE_USER("(?i)delete\\s+(\\w+)"),
    MANAGER_PROFILE("(?i)create\\s+manager\\s+profile"),
    MANAGE_PRODUCTS("(?)manage\\S+all\\S+products"),
    REMOVE_PRODUCTS("(?)remove\\s+(\\w+)"),
    CREATE_DISCOUNT_CODE("(?)create\\s+discount\\s+code"),
    DISCOUNT_CODE("(?)view\\s+discount\\s+code"),
    VIEW_DISCOUNT_CODE("(?)view\\s+discount\\s+code\\s+(\\w+)"),
    EDIT_DISCOUNT_CODE("(?)edit\\s+discount\\s+code\\s+(\\w+)"),
    REMOVE_DISCOUNT_CODE("(?)remove\\s+discount\\s+code\\s+(\\w+)"),
    MANAGE_REQUESTS("(?)manage\\s+requests"),
    REQUESTS_DETAILS("(?)details\\s+(\\w+)"),
    ACCEPT_REQUESTS("(?)accept\\s+(\\w+)"),
    DECLINE_REQUESTS("(?)decline\\s+(\\w+)"),
    MANAGE_CATEGORIES("(?)manage\\s+categories"),
    EDIT_CATEGORIES("(?)edit\\s+(\\w+)"),
    ADD_CATEGORIES("(?)add\\s+(\\w+)"),
    REMOVE_CATEGORIES("(?)remove\\s+(\\w+)");
    private final Pattern commandsPattern;

    ConsoleCommands(String commandsPatternString) {
        this.commandsPattern = Pattern.compile(commandsPatternString);
    }

    public Matcher getStringMatcher(String input) {
        return this.commandsPattern.matcher(input);
    }
    public Pattern getCommandsPattern() {
        return commandsPattern;
    }
}
