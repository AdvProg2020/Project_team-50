package model.log;

import model.Enum.DeliveryStatus;
import model.Product;
import model.account.Shopper;

import java.util.ArrayList;
import java.util.Date;

public class SellLog {
    private final String logId;
    private Date date;
    private double payment;
    private double offAmount;
    private Shopper shopper;
    private DeliveryStatus deliveryStatus;
    private ArrayList<Product> products;
    private ArrayList<SellLog> sellLogs = new ArrayList<SellLog>();

    public SellLog(String logId, Date date, double payment, Shopper shopper, ArrayList<Product> products) {
        this.logId = logId;
        this.date = date;
        this.payment = payment;
        this.shopper = shopper;
        this.products = products;
        sellLogs.add(this);
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

    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public ArrayList<SellLog> getShopperLogs(Shopper shopper) {
        //TODO
    }
}
