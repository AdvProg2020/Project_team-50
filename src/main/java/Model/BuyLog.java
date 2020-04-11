package Model;

import java.util.ArrayList;

public class BuyLog {
    private String logId;
    private String date;
    private double payment;
    private double discountAmount;
    private Seller seller;
    private ArrayList<Product> products;
    //status


    public BuyLog(String logId, String date, double payment, Seller seller, ArrayList<Product> products) {
        this.logId = logId;
        this.date = date;
        this.payment = payment;
        this.seller = seller;
        this.products = products;
    }
}
