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
                    String type = matcher.group(1);
                    String userName = matcher.group(2);
                    RegistrationMenu registrationMenu = null;
                    registrationMenu.register(type, userName);
                }
            } else if (ConsoleCommands.LOGIN.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.LOGIN.getStringMatcher(command);
                if (matcher.find()) {
                    String userName = matcher.group(1);
                    LoginMenu loginMenu = null;
                    loginMenu.login(userName);
                }
            } else if (ConsoleCommands.VIEW_MANAGER_PERSONAL_INFO.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.VIEW_MANAGER_PERSONAL_INFO.getStringMatcher(command);
                if (matcher.find()) {
                    controller.AdminController adminController = null;
                    adminController.showPersonalInfo();
                }
            } else if (ConsoleCommands.EDIT_MANAGER_PERSONAL_INFO.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.EDIT_MANAGER_PERSONAL_INFO.getStringMatcher(command);
                if (matcher.find()) {
                    String field = matcher.group(1);
                    //TODO
                }
            } else if (ConsoleCommands.MANAGING.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.MANAGING.getStringMatcher(command);
                if (matcher.find()) {
                    controller.AdminController adminController = null;
                    adminController.showAllUsers();
                }
            } else if (ConsoleCommands.VIEW_USER.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.VIEW_USER.getStringMatcher(command);
                if (matcher.find()) {
                    String userName = matcher.group(1);
                    
                }
            } else if (ConsoleCommands.DELETE_USER.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.DELETE_USER.getStringMatcher(command);
                if (matcher.find()) {
                    String userName = matcher.group(1);
                }
            } else if (ConsoleCommands.MANAGER_PROFILE.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.MANAGER_PROFILE.getStringMatcher(command);
                if (matcher.find()) {
                    //TODO
                }
            } else if (ConsoleCommands.MANAGE_PRODUCTS.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.MANAGE_PRODUCTS.getStringMatcher(command);
                if (matcher.find()) {
                    //TODO
                }
            } else if (ConsoleCommands.REMOVE_PRODUCTS.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.REMOVE_PRODUCTS.getStringMatcher(command);
                if (matcher.find()) {
                    String products = matcher.group(1);
                }
            } else if (ConsoleCommands.CREATE_DISCOUNT_CODE.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.CREATE_DISCOUNT_CODE.getStringMatcher(command);
                if (matcher.find()) {
                    //TODO
                }
            } else if (ConsoleCommands.MANAGER_DISCOUNT_CODE.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.MANAGER_DISCOUNT_CODE.getStringMatcher(command);
                if (matcher.find()) {
                    //TODO
                }
            } else if (ConsoleCommands.VIEW_DISCOUNT_CODE.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.VIEW_DISCOUNT_CODE.getStringMatcher(command);
                if (matcher.find()) {
                    String discountCode = matcher.group(1);
                }
            } else if (ConsoleCommands.EDIT_DISCOUNT_CODE.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.EDIT_DISCOUNT_CODE.getStringMatcher(command);
                if (matcher.find()) {
                    String discountCode = matcher.group(1);
                }
            } else if (ConsoleCommands.REMOVE_DISCOUNT_CODE.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.REMOVE_DISCOUNT_CODE.getStringMatcher(command);
                if (matcher.find()) {
                    String discountCode = matcher.group(1);
                }
            } else if (ConsoleCommands.MANAGE_REQUESTS.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.MANAGE_REQUESTS.getStringMatcher(command);
                if (matcher.find()) {
                    String discountCode = matcher.group(1);
                }
            } else if (ConsoleCommands.REQUESTS_DETAILS.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.REQUESTS_DETAILS.getStringMatcher(command);
                if (matcher.find()) {
                    String request = matcher.group(1);
                }
            } else if (ConsoleCommands.ACCEPT_REQUESTS.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.ACCEPT_REQUESTS.getStringMatcher(command);
                if (matcher.find()) {
                    String request = matcher.group(1);
                }
            } else if (ConsoleCommands.DECLINE_REQUESTS.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.DECLINE_REQUESTS.getStringMatcher(command);
                if (matcher.find()) {
                    String request = matcher.group(1);
                }
            } else if (ConsoleCommands.MANAGE_CATEGORIES.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.MANAGE_CATEGORIES.getStringMatcher(command);
                if (matcher.find()) {
                    //TODO
                }
            } else if (ConsoleCommands.EDIT_CATEGORIES.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.EDIT_CATEGORIES.getStringMatcher(command);
                if (matcher.find()) {
                    String category = matcher.group(1);
                }
            } else if (ConsoleCommands.ADD_CATEGORIES.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.ADD_CATEGORIES.getStringMatcher(command);
                if (matcher.find()) {
                    String category = matcher.group(1);
                }
            } else if (ConsoleCommands.REMOVE_CATEGORIES.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.REMOVE_CATEGORIES.getStringMatcher(command);
                if (matcher.find()) {
                    String category = matcher.group(1);
                }
            } else if (ConsoleCommands.MANAGE_CATEGORIES.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.MANAGE_CATEGORIES.getStringMatcher(command);
                if (matcher.find()) {
                    String discountCode = matcher.group(1);
                }
            } else if (ConsoleCommands.MANAGE_CATEGORIES.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.MANAGE_CATEGORIES.getStringMatcher(command);
                if (matcher.find()) {
                    String discountCode = matcher.group(1);
                }
            } else if (ConsoleCommands.MANAGE_CATEGORIES.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.MANAGE_CATEGORIES.getStringMatcher(command);
                if (matcher.find()) {
                    String discountCode = matcher.group(1);
                }
            } else if (ConsoleCommands.MANAGE_CATEGORIES.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.MANAGE_CATEGORIES.getStringMatcher(command);
                if (matcher.find()) {
                    String discountCode = matcher.group(1);
                }
            } else if (ConsoleCommands.MANAGE_CATEGORIES.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.MANAGE_CATEGORIES.getStringMatcher(command);
                if (matcher.find()) {
                    String discountCode = matcher.group(1);
                }
            }
        }
    }
}
