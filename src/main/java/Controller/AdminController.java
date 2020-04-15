package Controller;

import Model.*;

import java.util.ArrayList;

public class AdminController {
    public static void showPersonalInfo(){
        //TODO
    }

    public static void changePersonalInfo(Admin admin, String field, String newInfo){
        //TODO
    }

    public static ArrayList<Request> showRequestsList(){
        //TODO
    }

    public static boolean acceptOrDecline(String requestId, boolean isAccepted){
        //TODO
    }

    public static void addCodedDiscount(Admin admin){
        //TODO
    }

    public static void editCodedDiscount(String discountId, String field, String newInfo){
        //TODO
    }

    public static void deleteCodedDiscount(String discountId){
        //TODO
    }

    public static ArrayList<CodedDiscount> showCodedDiscounts(){
        //TODO
    }

    public static ArrayList<Person> showAllUsers(){
        //TODO
    }

    public static void deleteUser(String userName){
        //TODO
    }

    public static void addNewAdmin(){
        //TODO
    }

    public static ArrayList<Category> showCategories(){
        //TODO
    }

    public static void addCategory(String name, ArrayList<Product> productId){
        //TODO
    }

    public static void editCategory(Category category, String field, String newInfo){
        //TODO
    }

    public static void deleteCategory(String name){
        //TODO
    }
}
