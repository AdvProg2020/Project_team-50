package view;

import java.util.regex.Pattern;

public enum ConsoleCommands {
    ;
    private final Pattern commandsPattern;

    ConsoleCommands(String commandsPatternString) {
        this.commandsPattern = Pattern.compile(commandsPatternString);
    }

    public Pattern getCommandsPattern() {
        return commandsPattern;
    }
}
