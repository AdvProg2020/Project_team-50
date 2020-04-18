package controller;

import model.account.Person;
import model.account.Shopper;

public class ShopperController extends Account {
    private Shopper shopper;

    public ShopperController(Shopper shopper) {
        super(shopper);
        this.shopper = shopper;
    }

    public void showPersonalInfo(){
        //TODO
    }

    public void changePersonalInfo(Shopper shopper, String field, String newInfo){
        //TODO
    }

    public void scoreProducts(){
        //TODO
    }

    public void postComment(Shopper shopper, String title, String content){
        //TODO
    }

    public void compareTwoProduct(String productId1, String productId2){
        //TODO
    }

    public void showCredit(Shopper shopper){
        //TODO
    }

    public void purchase(Shopper shopper){
        //TODO
    }
}
