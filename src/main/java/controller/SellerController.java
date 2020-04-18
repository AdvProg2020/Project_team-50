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

    public void showPersonalInfo(){
        //TODO
    }

    public void changePersonalInfo(Seller seller, String field, String newInfo){
        //TODO
    }

    public void showFactoryInfo(Seller seller){
        //TODO
    }

    public void addProduct(String productId){
        //TODO
    }

    public void editProduct(String productId){
        //TODO
    }

    public void deleteProduct(String productId){
        //TODO
    }

    public ArrayList<Product> showProducts(){
        //TODO
    }

    public ArrayList<Product> showSoldProducts(){
        //TODO
    }

    public void addOff(Seller seller){
        //TODO
    }

    public void editOff(String offId){
        //TODO
    }

    public void showCredit(Seller seller){
        //TODO
    }
}
