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
    REMOVE_CATEGORIES("(?)remove\\s+(\\w+)"),
    VIEW_PERSONAL_SELLER_INFO("(?)view\\s+personal\\s+info"),
    EDIT_PERSONAL_SELLER_INFO("(?)edit\\s+(\\w+)"),
    VIEW_COMPANY_INFO("(?)view\\s+company\\s+information"),
    VIEW_SALES_HISTORY("(?)view\\s+sales\\s+history"),
    MANAGE_SELLER_PRODUCTS("(?)manage\\s+products"),
    VIEW_SELLER_PRODUCTS("(?)view\\s+(\\w+)"),
    VIEW_BUYERS_SELLER_PRODUCTS("(?)view\\s+buyers\\s+(\\w+)"),
    EDIT_SELLER_PRODUCTS("(?)edit\\s+(\\w+)"),
    ADD_SELLER_PRODUCTS("(?)add\\s+product"),
    REMOVE_SELLER_PRODUCTS("(?)remove\\s+product\\s+(\\w+)"),
    SHOW_SELLER_CATEGORIES("(?)show\\s+categories"),
    MANAGE_SELLER_OFFS("(?)view\\s+offs"),
    VIEW_SELLER_OFFS("(?)view\\s+(\\w+)"),
    EDIT_SELLER_OFFS("(?)edit\\s+(\\w+)"),
    ADD_SELLER_OFFS("(?)add\\s+(\\w+)"),
    SELLER_BALANCE("(?)view\\s+balance"),
    VIEW_PERSONAL_SHOPPER_INFO("(?)view\\s+personal\\s+info"),
    EDIT_PERSONAL_SHOPPER_INFO("(?)edit\\s+(\\w+)"),
    VIEW_SHOPPER_CART("(?)view\\s+cart"),
    SHOW_SHOPPER_PRODUCTS("(?)show\\s+products"),
    VIEW_SHOPPER_PRODUCTS("(?)view\\s+(\\W+)"),
    INCREASE_SHOPPER_PRODUCTS("(?)increase\\s+(\\W+)"),
    DECREASE_SHOPPER_PRODUCTS("(?)decrease\\s+(\\W+)"),
    SHOW_SHOPPER_TOTAL_PRICE("(?)show\\s+total\\s+price"),
    PURCHASE_SHOPPER("(?)purchase"),
    ENTER_PURCHASE("(?)purchase"),
    VIEW_SHOPPER_ORDERS("(?)view\\s+orders"),
    SHOW_SHOPPER_ORDER("(?)show\\s+order\\s+(\\w+)"),
    RATE_SHOPPER("(?)rate\\s+(\\w+)(\\w+)"),
    SHOPPER_BALANCE("(?)view\\s+balance"),
    SHOPPER_DISCOUNT_CODE("(?)view\\s+discount\\s+codes");

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
