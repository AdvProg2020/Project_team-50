package Model;

import java.util.ArrayList;

public class SellLog {
    private String logId;
    private String date;
    private double payment;
    private double discountAmount;
    private Shopper shopper;
    private ArrayList<Product> products;
    //status


    public SellLog(String logId, String date, double payment, Shopper shopper, ArrayList<Product> products) {
        this.logId = logId;
        this.date = date;
        this.payment = payment;
        this.shopper = shopper;
        this.products = products;
    }
}
