package controller;

import model.account.Person;
import model.account.Shopper;

public class ShopperController extends Account {
    private Shopper shopper;

    public ShopperController(Shopper shopper) {
        super(shopper);
        this.shopper = shopper;
    }

    public static void showPersonalInfo(){
        //TODO
    }

    public static void changePersonalInfo(Shopper shopper, String field, String newInfo){
        //TODO
    }

    public static void scoreProducts(){
        //TODO
    }

    public void postComment(Shopper shopper, String title, String content){
        //TODO
    }

    public static void compareTwoProduct(String productId1, String productId2){
        //TODO
    }

    public static void showCredit(Shopper shopper){
        //TODO
    }

    public static void purchase(Shopper shopper){
        //TODO
    }
}
