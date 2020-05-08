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
    MANAGER_PROFILE("(?i)create\\s+manager\\s+profile");


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
