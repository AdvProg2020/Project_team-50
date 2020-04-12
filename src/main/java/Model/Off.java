package Model;

import java.util.ArrayList;

public class Off {
    private String offId;
    private ArrayList<Product> allProducts = new ArrayList<Product>();
    //state
    private String startTime;
    private String endTime;
    private double offAmount;
    private Seller seller;

    public Off(String offId, String startTime, String endTime, double offAmount, Seller seller) {
        this.offId = offId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.offAmount = offAmount;
        this.seller = seller;
        //state
    }
}
