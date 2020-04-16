package model;

import model.Enum.OffCondition;
import model.account.Seller;

import java.util.ArrayList;
import java.util.Date;

public class Off {
    private String offId;
    private ArrayList<Product> allProducts = new ArrayList<Product>();
    private OffCondition offCondition;
    private Date startTime;
    private Date endTime;
    private double offAmount;
    private Seller seller;
    private ArrayList<Off> allOff = new ArrayList<Off>();

    public Off(String offId, Date startTime, Date endTime, double offAmount, Seller seller) {
        this.offId = offId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.offAmount = offAmount;
        this.seller = seller;
        //state
    }

    public String getOffId() {
        return offId;
    }

    public void setOffCondition(OffCondition offCondition) {
        this.offCondition = offCondition;
    }

    public OffCondition getOffCondition() {
        return offCondition;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setOffAmount(double offAmount) {
        this.offAmount = offAmount;
    }

    public double getOffAmount() {
        return offAmount;
    }

    public void addOff(Off off){
        //TODO
    }

    public void addProductToOff(Product product){
        //TODO
    }

    public void deleteProductFromOff(Product product){
        //TODO
    }
}
