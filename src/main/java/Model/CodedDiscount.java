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

    public CodedDiscount(String discountId, Date startTime, Date endTime, double discountRate, double maxDiscountRate, ArrayList<Person> allPerson) {
        this.discountId = discountId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.discountRate = discountRate;
        this.maxDiscountRate = maxDiscountRate;
        codedDiscounts.add(this);
        for (Person person: allPerson) {
            usageCount.put(person, 0);
        }
    }
}
