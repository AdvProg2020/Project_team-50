package Model;

import java.util.ArrayList;

public class CodedDiscount {
    private String discountCode;
    private int startTime;
    private int endTime;
    private double discountRate;
    private int repeatDiscount;
    private ArrayList<String> listOfDiscountedUsers = new ArrayList<String>();

    public CodedDiscount(String discountCode, int startTime, int endTime, double discountRate, int repeatDiscount, ArrayList<String> listOfDiscountedUsers) {
        this.discountCode = discountCode;
        this.startTime = startTime;
        this.endTime = endTime;
        this.discountRate = discountRate;
        this.repeatDiscount = repeatDiscount;
        this.listOfDiscountedUsers = listOfDiscountedUsers;
    }
}
