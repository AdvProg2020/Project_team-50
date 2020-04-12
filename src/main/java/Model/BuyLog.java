package Model;

import java.util.ArrayList;
import java.util.Date;

public class BuyLog {
    private String logId;
    private Date date;
    private double payment;
    private double discountAmount;
    private Seller seller;
    //status
    private ArrayList<Product> products;

    public BuyLog(String logId, Date date, double payment, Seller seller, ArrayList<Product> products) {
        this.logId = logId;
        this.date = date;
        this.payment = payment;
        this.seller = seller;
        this.products = products;
    }
}
