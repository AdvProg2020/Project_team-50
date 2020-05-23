package view;

import model.Off;

import javax.sound.midi.ControllerEventListener;
import java.util.ArrayList;
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
                    controller.AdminController adminController = null;
                    adminController.changePersonalInfo(field);
                }
            } else if (ConsoleCommands.MANAGING.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.MANAGING.getStringMatcher(command);
                if (matcher.find()) {
                    controller.AdminController adminController = null;
                    adminController.showAllUsers();
                     if (ConsoleCommands.VIEW_USER.getStringMatcher(command).matches()) {
                        Matcher subMatcher = ConsoleCommands.VIEW_USER.getStringMatcher(command);
                        if (matcher.find()) {
                            String userName = matcher.group(1);
                            //TODO
                        }
                    } else if (ConsoleCommands.DELETE_USER.getStringMatcher(command).matches()) {
                         Matcher subMatcher = ConsoleCommands.DELETE_USER.getStringMatcher(command);
                         if (matcher.find()) {
                             String userName = matcher.group(1);
                             adminController.deleteUser(userName);
                         }
                     } else if (ConsoleCommands.MANAGER_PROFILE.getStringMatcher(command).matches()) {
                         Matcher subMatcher = ConsoleCommands.MANAGER_PROFILE.getStringMatcher(command);
                         if (matcher.find()) {
                             adminController.addNewAdmin();
                         }
                     }
                }
            } else if (ConsoleCommands.MANAGE_PRODUCTS.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.MANAGE_PRODUCTS.getStringMatcher(command);
                if (matcher.find()) {
                     if (ConsoleCommands.REMOVE_PRODUCTS.getStringMatcher(command).matches()) {
                        Matcher subMatcher = ConsoleCommands.REMOVE_PRODUCTS.getStringMatcher(command);
                        if (matcher.find()) {
                            String products = matcher.group(1);
                            //TODO
                        }
                    }
                }
            } else if (ConsoleCommands.CREATE_DISCOUNT_CODE.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.CREATE_DISCOUNT_CODE.getStringMatcher(command);
                if (matcher.find()) {
                    controller.AdminController adminController = null;
                    adminController.addCodedDiscount();
                }
            } else if (ConsoleCommands.MANAGER_DISCOUNT_CODE.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.MANAGER_DISCOUNT_CODE.getStringMatcher(command);
                if (matcher.find()) {
                    controller.AdminController adminController = null;
                    adminController.showCodedDiscounts();
                     if (ConsoleCommands.VIEW_DISCOUNT_CODE.getStringMatcher(command).matches()) {
                        Matcher subMatcher = ConsoleCommands.VIEW_DISCOUNT_CODE.getStringMatcher(command);
                        if (matcher.find()) {
                            String discountCodeId = matcher.group(1);
                            //TODO
                        }
                    } else if (ConsoleCommands.EDIT_DISCOUNT_CODE.getStringMatcher(command).matches()) {
                         Matcher subMatcher = ConsoleCommands.EDIT_DISCOUNT_CODE.getStringMatcher(command);
                         if (matcher.find()) {
                             String discountCodeId = matcher.group(1);
                             adminController.editCodedDiscount(discountCodeId);
                         }
                     } else if (ConsoleCommands.REMOVE_DISCOUNT_CODE.getStringMatcher(command).matches()) {
                         Matcher subMatcher = ConsoleCommands.REMOVE_DISCOUNT_CODE.getStringMatcher(command);
                         if (matcher.find()) {
                             String discountCodeId = matcher.group(1);
                             adminController.deleteCodedDiscount(discountCodeId);
                         }
                     }
                }
            } else if (ConsoleCommands.MANAGE_REQUESTS.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.MANAGE_REQUESTS.getStringMatcher(command);
                if (matcher.find()) {
                    String discountCode = matcher.group(1);
                    controller.AdminController adminController = null;
                    adminController.showRequestsList();
                }
            } else if (ConsoleCommands.REQUESTS_DETAILS.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.REQUESTS_DETAILS.getStringMatcher(command);
                if (matcher.find()) {
                    String request = matcher.group(1);
                    //TODO
                }
            } else if (ConsoleCommands.ACCEPT_REQUESTS.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.ACCEPT_REQUESTS.getStringMatcher(command);
                if (matcher.find()) {
                    String request = matcher.group(1);
                    controller.AdminController adminController = null;
                    adminController.acceptOrDecline(request);
                }
            } else if (ConsoleCommands.DECLINE_REQUESTS.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.DECLINE_REQUESTS.getStringMatcher(command);
                if (matcher.find()) {
                    String request = matcher.group(1);
                    controller.AdminController adminController = null;
                    adminController.acceptOrDecline(request);
                }
            } else if (ConsoleCommands.MANAGE_CATEGORIES.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.MANAGE_CATEGORIES.getStringMatcher(command);
                if (matcher.find()) {
                    controller.AdminController adminController = null;
                    adminController.showCategories();
                }
            } else if (ConsoleCommands.EDIT_CATEGORIES.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.EDIT_CATEGORIES.getStringMatcher(command);
                if (matcher.find()) {
                    String category = matcher.group(1);
                    controller.AdminController adminController = null;
                    adminController.editCategory();
                }
            } else if (ConsoleCommands.ADD_CATEGORIES.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.ADD_CATEGORIES.getStringMatcher(command);
                if (matcher.find()) {
                    String category = matcher.group(1);
                    controller.AdminController adminController = null;
                    adminController.addCategory(, category);
                }
            } else if (ConsoleCommands.REMOVE_CATEGORIES.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.REMOVE_CATEGORIES.getStringMatcher(command);
                if (matcher.find()) {
                    String category = matcher.group(1);
                    controller.AdminController adminController = null;
                    adminController.deleteCategory(category);
                }
            } else if (ConsoleCommands.VIEW_SELLER_PERSONAL_INFO.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.VIEW_SELLER_PERSONAL_INFO.getStringMatcher(command);
                if (matcher.find()) {
                    controller.SellerController sellerController = null;
                    sellerController.showPersonalInfo();
                }
            } else if (ConsoleCommands.EDIT_SELLER_PERSONAL_INFO.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.EDIT_SELLER_PERSONAL_INFO.getStringMatcher(command);
                if (matcher.find()) {
                    String field = matcher.group(1);
                    controller.SellerController sellerController = null;
                    sellerController.changePersonalInfo(field);
                }
            } else if (ConsoleCommands.VIEW_COMPANY_INFO.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.VIEW_COMPANY_INFO.getStringMatcher(command);
                if (matcher.find()) {
                    controller.SellerController sellerController = null;
                    sellerController.showFactoryInfo();
                }
            } else if (ConsoleCommands.VIEW_SALES_HISTORY.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.VIEW_SALES_HISTORY.getStringMatcher(command);
                if (matcher.find()) {
                    controller.SellerController sellerController = null;
                    sellerController.showSoldProducts();
                }
            } else if (ConsoleCommands.MANAGE_SELLER_PRODUCTS.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.MANAGE_SELLER_PRODUCTS.getStringMatcher(command);
                if (matcher.find()) {
                    //TODO
                }
            } else if (ConsoleCommands.VIEW_SELLER_PRODUCTS.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.VIEW_SELLER_PRODUCTS.getStringMatcher(command);
                if (matcher.find()) {
                    String productId = matcher.group(1);
                    controller.SellerController sellerController = null;
                    sellerController.showProducts();
                }
            } else if (ConsoleCommands.VIEW_BUYERS_SELLER_PRODUCTS.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.VIEW_BUYERS_SELLER_PRODUCTS.getStringMatcher(command);
                if (matcher.find()) {
                    String buyer = matcher.group(1);
                    //TODO
                }
            } else if (ConsoleCommands.EDIT_SELLER_PRODUCTS.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.EDIT_SELLER_PRODUCTS.getStringMatcher(command);
                if (matcher.find()) {
                    String productId = matcher.group(1);
                    controller.SellerController sellerController = null;
                    sellerController.editProduct(productId);
                }
            } else if (ConsoleCommands.ADD_SELLER_PRODUCTS.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.ADD_SELLER_PRODUCTS.getStringMatcher(command);
                if (matcher.find()) {
                    String productId = matcher.group(1);
                    controller.SellerController sellerController = null;
                    sellerController.addProduct(productId);
                }
            } else if (ConsoleCommands.REMOVE_SELLER_PRODUCTS.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.REMOVE_SELLER_PRODUCTS.getStringMatcher(command);
                if (matcher.find()) {
                    String productId = matcher.group(1);
                    controller.SellerController sellerController = null;
                    sellerController.deleteProduct(productId);
                }
            } else if (ConsoleCommands.SHOW_SELLER_CATEGORIES.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.SHOW_SELLER_CATEGORIES.getStringMatcher(command);
                if (matcher.find()) {
                    //TODO
                }
            } else if (ConsoleCommands.MANAGE_SELLER_OFFS.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.MANAGE_SELLER_OFFS.getStringMatcher(command);
                if (matcher.find()) {
                    //TODO
                }
            } else if (ConsoleCommands.VIEW_SELLER_OFFS.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.VIEW_SELLER_OFFS.getStringMatcher(command);
                if (matcher.find()) {
                    //TODO
                }
            } else if (ConsoleCommands.EDIT_SELLER_OFFS.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.EDIT_SELLER_OFFS.getStringMatcher(command);
                if (matcher.find()) {
                    String offId = matcher.group(1);
                    controller.SellerController sellerController = null;
                    sellerController.editOff(offId);
                }
            } else if (ConsoleCommands.ADD_SELLER_OFFS.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.ADD_SELLER_OFFS.getStringMatcher(command);
                if (matcher.find()) {
                    ArrayList<String> offId = null;
                    offId.add(matcher.group(1));
                    model.account.Seller seller = null;
                    seller.setAllOffers(offId);
                }
            } else if (ConsoleCommands.SELLER_BALANCE.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.SELLER_BALANCE.getStringMatcher(command);
                if (matcher.find()) {
                    //TODO
                }
            } else if (ConsoleCommands.VIEW_SHOPPER_PERSONAL_INFO.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.VIEW_SHOPPER_PERSONAL_INFO.getStringMatcher(command);
                if (matcher.find()) {
                    //TODO
                }
            } else if (ConsoleCommands.EDIT_SHOPPER_PERSONAL_INFO.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.EDIT_SHOPPER_PERSONAL_INFO.getStringMatcher(command);
                if (matcher.find()) {
                    //TODO
                }
            } else if (ConsoleCommands.VIEW_SHOPPER_CART.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.VIEW_SHOPPER_CART.getStringMatcher(command);
                if (matcher.find()) {
                    //TODO
                }
            } else if (ConsoleCommands.SHOW_SHOPPER_PRODUCTS.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.SHOW_SHOPPER_PRODUCTS.getStringMatcher(command);
                if (matcher.find()) {
                    //TODO
                }
            } else if (ConsoleCommands.VIEW_SHOPPER_PRODUCTS.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.VIEW_SHOPPER_PRODUCTS.getStringMatcher(command);
                if (matcher.find()) {
                    //TODO
                }
            } else if (ConsoleCommands.INCREASE_SHOPPER_PRODUCTS.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.INCREASE_SHOPPER_PRODUCTS.getStringMatcher(command);
                if (matcher.find()) {
                    //TODO
                }
            } else if (ConsoleCommands.DECREASE_SHOPPER_PRODUCTS.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.DECREASE_SHOPPER_PRODUCTS.getStringMatcher(command);
                if (matcher.find()) {
                    //TODO
                }
            } else if (ConsoleCommands.SHOW_SHOPPER_TOTAL_PRICE.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.SHOW_SHOPPER_TOTAL_PRICE.getStringMatcher(command);
                if (matcher.find()) {
                    //TODO
                }
            } else if (ConsoleCommands.PURCHASE_SHOPPER.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.PURCHASE_SHOPPER.getStringMatcher(command);
                if (matcher.find()) {
                    //TODO
                }
            } else if (ConsoleCommands.ENTER_PURCHASE.getStringMatcher(command).matches()) {
                Matcher matcher = ConsoleCommands.ENTER_PURCHASE.getStringMatcher(command);
                if (matcher.find()) {
                    //TODO
                }
            }
        }
    }
}
