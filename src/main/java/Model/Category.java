package Model;

import java.util.ArrayList;

public class Category {
    private String name;
    public static ArrayList<Category> allCategories = new ArrayList<Category>();
    public static ArrayList<Category> subCategories = new ArrayList<Category>();
    private ArrayList<Product> allProducts;

    public Category(String name) {
        this.name = name;
        allCategories.add(this);
    }
}
