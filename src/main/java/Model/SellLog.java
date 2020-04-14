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

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getLogId() {
        return logId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double getPayment() {
        return payment;
    }

    public void setOffAmount(double offAmount) {
        this.offAmount = offAmount;
    }

    public double getOffAmount() {
        return offAmount;
    }

    public Shopper getShopper() {
        return shopper;
    }

    public void getShopperLogs(Shopper shopper){
        //TODO
    }


}
