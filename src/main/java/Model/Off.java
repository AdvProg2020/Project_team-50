package Model;

import java.util.ArrayList;
import java.util.Date;

public class Off {
    private String offId;
    private ArrayList<Product> allProducts = new ArrayList<Product>();
    //state
    private Date startTime;
    private Date endTime;
    private double offAmount;
    private Seller seller;

    public Off(String offId, Date startTime, Date endTime, double offAmount, Seller seller) {
        this.offId = offId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.offAmount = offAmount;
        this.seller = seller;
        //state
    }
}
