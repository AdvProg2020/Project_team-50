package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class CodedDiscount {
    private String discountId;
    private Date startTime;
    private Date endTime;
    private double discountRate;
    private double maxDiscountRate;
    private ArrayList<Person> allPerson = new ArrayList<Person>();
    private HashMap<Person, Integer> usageCount = new HashMap<Person, Integer>();
    public ArrayList<CodedDiscount> codedDiscounts = new ArrayList<CodedDiscount>();

    public CodedDiscount(String discountId, Date startTime, Date endTime, double discountRate, double maxDiscountRate) {
        this.discountId = discountId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.discountRate = discountRate;
        this.maxDiscountRate = maxDiscountRate;
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

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setMaxDiscountRate(double maxDiscountRate) {
        this.maxDiscountRate = maxDiscountRate;
    }

    public double getMaxDiscountRate() {
        return maxDiscountRate;
    }

    public static CodedDiscount getCodedDiscountById(String discountId){
        //TODO
    }

    public void addCodedDiscount(){
        //TODO
    }

    public void deleteCodedDiscount(CodedDiscount codedDiscount){
        //TODO
    }

    public void setUsageCount(HashMap<Person, Integer> usageCount) {
        this.usageCount = usageCount;
    }

    public static boolean canShopperUseCodedDiscount(Shopper shopper){
        //TODO
    }
}
