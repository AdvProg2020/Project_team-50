package model.account;

import model.Off;
import model.Product;
import model.log.SellLog;

import java.util.ArrayList;

public class Seller extends Person {
    private String factoryName;
    private double credit;
    public ArrayList<Product> allProducts = new ArrayList<Product>();
    public ArrayList<Off> allOffers = new ArrayList<Off>();
    public ArrayList<SellLog> sellLogs = new ArrayList<SellLog>();

    public Seller(String userName, String firstName, String lastName, String eMail, String phoneNumber, String password, String factoryName, double credit) {
        super(userName, firstName, lastName, eMail, phoneNumber, password);
        this.factoryName = factoryName;
        this.credit = credit;
        allPerson.add(this);
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setAllProducts(ArrayList<Product> allProducts) {
        this.allProducts = allProducts;
    }

    public ArrayList<Product> getAllProducts() {
        return allProducts;
    }

    public void setAllOffers(ArrayList<Off> allOffers) {
        this.allOffers = allOffers;
    }

    public ArrayList<Off> getAllOffers() {
        return allOffers;
    }

    public void setSellLogs(ArrayList<SellLog> sellLogs) {
        this.sellLogs = sellLogs;
    }

    public ArrayList<SellLog> getSellLogs() {
        return sellLogs;
    }
}
