package view;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum ConsoleCommands {
    LOGIN("(?i)login\\s+(\\w+)"),
    REGISTER("(?i)create\\s+account\\s+(\\w+)\\s+(\\w+)"),
    //USER_MENU("(?i)view\\s+personal\\s+info"),
    VIEW_MANAGER_PERSONAL_INFO("(?i)view\\s+personal\\s+info"),
    EDIT_MANAGER_PERSONAL_INFO("(?i)edit\\s+(\\w+)"),
    MANAGING("(?i)manage\\s+users"),
    VIEW_USER("(?i)view\\s+(\\w+)"),
    DELETE_USER("(?i)delete\\s+(\\w+)"),
    MANAGER_PROFILE("(?i)create\\s+manager\\s+profile"),
    MANAGE_PRODUCTS("(?i)manage\\S+all\\S+products"),
    REMOVE_PRODUCTS("(?i)remove\\s+(\\w+)"),
    CREATE_DISCOUNT_CODE("(?i)create\\s+discount\\s+code"),
    MANAGER_DISCOUNT_CODE("(?i)view\\s+discount\\s+code"),
    VIEW_DISCOUNT_CODE("(?i)view\\s+discount\\s+code\\s+(\\w+)"),
    EDIT_DISCOUNT_CODE("(?i)edit\\s+discount\\s+code\\s+(\\w+)"),
    REMOVE_DISCOUNT_CODE("(?i)remove\\s+discount\\s+code\\s+(\\w+)"),
    MANAGE_REQUESTS("(?i)manage\\s+requests"),
    REQUESTS_DETAILS("(?i)details\\s+(\\w+)"),
    ACCEPT_REQUESTS("(?i)accept\\s+(\\w+)"),
    DECLINE_REQUESTS("(?i)decline\\s+(\\w+)"),
    MANAGE_CATEGORIES("(?i)manage\\s+categories"),
    EDIT_CATEGORIES("(?i)edit\\s+(\\w+)"),
    ADD_CATEGORIES("(?i)add\\s+(\\w+)"),
    REMOVE_CATEGORIES("(?i)remove\\s+(\\w+)"),
    VIEW_PERSONAL_SELLER_INFO("(?i)view\\s+personal\\s+info"),
    EDIT_PERSONAL_SELLER_INFO("(?i)edit\\s+(\\w+)"),
    VIEW_COMPANY_INFO("(?i)view\\s+company\\s+information"),
    VIEW_SALES_HISTORY("(?i)view\\s+sales\\s+history"),
    MANAGE_SELLER_PRODUCTS("(?i)manage\\s+products"),
    VIEW_SELLER_PRODUCTS("(?i)view\\s+(\\w+)"),
    VIEW_BUYERS_SELLER_PRODUCTS("(?i)view\\s+buyers\\s+(\\w+)"),
    EDIT_SELLER_PRODUCTS("(?i)edit\\s+(\\w+)"),
    ADD_SELLER_PRODUCTS("(?i)add\\s+product"),
    REMOVE_SELLER_PRODUCTS("(?i)remove\\s+product\\s+(\\w+)"),
    SHOW_SELLER_CATEGORIES("(?i)show\\s+categories"),
    MANAGE_SELLER_OFFS("(?i)view\\s+offs"),
    VIEW_SELLER_OFFS("(?i)view\\s+(\\w+)"),
    EDIT_SELLER_OFFS("(?i)edit\\s+(\\w+)"),
    ADD_SELLER_OFFS("(?i)add\\s+(\\w+)"),
    SELLER_BALANCE("(?i)view\\s+balance"),
    VIEW_PERSONAL_SHOPPER_INFO("(?i)view\\s+personal\\s+info"),
    EDIT_PERSONAL_SHOPPER_INFO("(?i)edit\\s+(\\w+)"),
    VIEW_SHOPPER_CART("(?i)view\\s+cart"),
    SHOW_SHOPPER_PRODUCTS("(?i)show\\s+products"),
    VIEW_SHOPPER_PRODUCTS("(?i)view\\s+(\\W+)"),
    INCREASE_SHOPPER_PRODUCTS("(?i)increase\\s+(\\W+)"),
    DECREASE_SHOPPER_PRODUCTS("(?i)decrease\\s+(\\W+)"),
    SHOW_SHOPPER_TOTAL_PRICE("(?i)show\\s+total\\s+price"),
    PURCHASE_SHOPPER("(?i)purchase"),
    ENTER_PURCHASE("(?i)purchase"),
    VIEW_SHOPPER_ORDERS("(?i)view\\s+orders"),
    SHOW_SHOPPER_ORDER("(?i)show\\s+order\\s+(\\w+)"),
    RATE_SHOPPER("(?i)rate\\s+(\\w+)(\\w+)"),
    SHOPPER_BALANCE("(?i)view\\s+balance"),
    SHOPPER_DISCOUNT_CODE("(?i)view\\s+discount\\s+codes"),
    PRODUCTS("(?i)products"),
    CATEGORIES("(?i)view\\s+categories"),
    FILTER("(?i)filtering"),
    AVAILABLE_FILTERS("(?i)show\\s+available\\s+filters"),
    FILTER_WITH_AVAILABLE_FILTER("(?i)filter\\s+(\\w+)"),
    CHOSEN_FILTERS("(?i)current\\s+filters"),
    DISABLE_FILTERS("(?i)disable\\s+filter\\s+(\\w+)"),
    SORTING("(?i)sorting"),
    AVAILABLE_SORTS("(?i)show\\s+available\\s+sorts"),
    SORT_WITH_AVAILABLE_SORT("(?i)sort\\s+(\\w+)"),
    CHOSEN_SORT("(?i)current\\s+sort"),
    DISABLE_SORT("(?i)disable\\s+sort"),
    VIEW_PRODUCTS("(?i)view\\s+products"),
    SHOW_PRODUCTS("(?i)show\\s+product(\\w+)"),
    DIGEST("(?i)digest"),
    ADD_TO_CART("(?i)add\\s+to\\s+cart"),
    SELECT_SELLER("(?i)select\\s+seller(\\w+)"),
    PRODUCT_ATTRIBUTES("(?i)attributes"),
    COMPARING("(?i)compare\\s+(\\w+)"),
    COMMENTS("(?i)comments"),
    ADD_COMMENTS("(?i)add\\s+comment\ntitle:\ncontent:"),
    OFFS("(?i)offs"),
    AUCTION_PRODUCTS("(?i)show\\s+product(\\w+)");
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
