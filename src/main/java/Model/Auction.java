package Model;

import java.util.ArrayList;

public class Auction {
    private String offId;
    private ArrayList<String> productList = new ArrayList<String>();
    private String auctionStatus;
    private int startTime;
    private int endTime;
    private double discountRate;

    public Auction(String offId, ArrayList<String> productList, String auctionStatus, int startTime, int endTime, double discountRate) {
        this.offId = offId;
        this.productList = productList;
        this.auctionStatus = auctionStatus;
        this.startTime = startTime;
        this.endTime = endTime;
        this.discountRate = discountRate;
    }
}
