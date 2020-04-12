package Model;

import java.util.ArrayList;

public class Category {
    private String name;
    public static ArrayList<Category> allCategories = new ArrayList<Category>();
    public static ArrayList<Category> subCategories = new ArrayList<Category>();
    private ArrayList<Product> allProducts;
    //ویژگی های مخصوص


    public Category(String name, ArrayList<Product> allProducts) {
        this.name = name;
        this.allProducts = allProducts;
    }
}
