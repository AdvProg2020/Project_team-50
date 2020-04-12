package Model;

import java.util.ArrayList;
import java.util.Date;

public class SellLog {
    private String logId;
    private Date date;
    private double payment;
    private double offAmount;
    private Shopper shopper;
    //status
    private ArrayList<Product> products;

    public SellLog(String logId, Date date, double payment, Shopper shopper, ArrayList<Product> products) {
        this.logId = logId;
        this.date = date;
        this.payment = payment;
        this.shopper = shopper;
        this.products = products;
    }
}
