package controller;

import model.Product;
import model.account.Person;
import model.account.Seller;

import java.util.ArrayList;

public class SellerController extends Account{
    private Seller seller;

    public SellerController(Seller seller) {
        super(seller);
        this.seller = seller;
    }

    public static void showPersonalInfo(){
        //TODO
    }

    public static void changePersonalInfo(Seller seller, String field, String newInfo){
        if (field.equalsIgnoreCase("first name")){
            seller.setFirstName(newInfo);
        }
        if (field.equalsIgnoreCase("last name")){
            seller.setLastName(newInfo);
        }
        if (field.equalsIgnoreCase("email")){
            seller.seteMail(newInfo);
        }
        if (field.equalsIgnoreCase("phone number")){
            seller.setPhoneNumber(newInfo);
        }
        if (field.equalsIgnoreCase("password")){
            seller.setPassword(newInfo);
        }
        if (field.equalsIgnoreCase("factory name")){
            seller.setFactoryName(newInfo);
        }
    }

    public static void showFactoryInfo(Seller seller){
        //TODO
    }

    public static void addProduct(String productId){
        //TODO
    }

    public static  void editProduct(String productId){
        //TODO
    }

    public static  void deleteProduct(String productId){
        //TODO
    }

    public static ArrayList<Product> showProducts(){
        //TODO
    }

    public static ArrayList<Product> showSoldProducts(){
        //TODO
    }

    public static void addOff(Seller seller){
        //TODO
    }

    public static void editOff(String offId){
        //TODO
    }

    public static void showCredit(Seller seller){
        //TODO
    }
}