package model.log;

import model.Enum.DeliveryStatus;
import model.Product;
import model.account.Seller;

import java.util.ArrayList;
import java.util.Date;

public class BuyLog {
    private String logId;
    private Date date;
    private double payment;
    private double discountAmount;
    private Seller seller;
    private DeliveryStatus deliveryStatus;
    private ArrayList<Product> products;
    private ArrayList<BuyLog> buyLogs = new ArrayList<BuyLog>();

    public BuyLog(String logId, Date date, double payment, Seller seller, ArrayList<Product> products) {
        this.logId = logId;
        this.date = date;
        this.payment = payment;
        this.seller = seller;
        this.products = products;
        buyLogs.add(this);
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

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setBuyLogs(ArrayList<BuyLog> buyLogs) {
        this.buyLogs = buyLogs;
    }

    public ArrayList<BuyLog> getBuyLogs() {
        return buyLogs;
    }

    public ArrayList<BuyLog> getSellerLogs(Seller seller){
        //TODO
    }

}
