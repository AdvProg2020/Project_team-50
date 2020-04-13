package Model;

import java.util.ArrayList;

public class Category {
    private String name;
    private String specialFeature;
    private String points;
    private ArrayList<String> productList = new ArrayList<String>();

    public Category(String name, String specialFeature, String points, ArrayList<String> productList) {
        this.name = name;
        this.specialFeature = specialFeature;
        this.points = points;
        this.productList = productList;
    }
}
