package Model;

import java.util.ArrayList;

public class CodedDiscount {
    private String discountId;
    private String startTime;
    private String endTime;
    private double discountRate;
    private double maxDiscountRate;
    private int usageCount;
    private ArrayList<Person> allPerson = new ArrayList<Person>();
    private ArrayList<Product> products = new ArrayList<Product>();

    public CodedDiscount(String discountId, String startTime, String endTime, double discountRate, double maxDiscountRate, int usageCount) {
        this.discountId = discountId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.discountRate = discountRate;
        this.maxDiscountRate = maxDiscountRate;
        this.usageCount = usageCount;
    }
}
