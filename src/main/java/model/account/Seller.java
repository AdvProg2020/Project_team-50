package model.account;

import model.Off;
import model.Product;
import model.log.SellLog;

import java.util.ArrayList;

public class Seller extends Person {
    private String factoryName;
    public ArrayList<Product> allProducts = new ArrayList<Product>();
    public ArrayList<Off> allOffers = new ArrayList<Off>();
    public ArrayList<SellLog> sellLogs = new ArrayList<SellLog>();

    public Seller(String userName, String firstName, String lastName, String eMail, String phoneNumber, String password, String factoryName) {
        super(userName, firstName, lastName, eMail, phoneNumber, password);
        this.factoryName = factoryName;
        allPerson.add(this);
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void showPersonalAccountInfo(){
        //TODO
    }

    public void changePersonalInfo(){
        //TODO
    }

    public void showFactoryInfo(){
        //TODO
    }

    public void showSalesProducts(){
        //TODO
    }

    public void addProduct(){
        //TODO
    }

    public void editProduct(String productId){
        //TODO
    }

    public void deleteProduct(){
        //TODO
    }

    public void addNewOff(){
        //TODO
    }

    public void editOff(String offId){
        //TODO
    }

}
