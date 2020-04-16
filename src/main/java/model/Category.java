package model;

import java.util.ArrayList;

public class Category {
    private String name;
    public static ArrayList<Category> allCategories;
    public static ArrayList<Category> subCategories;
    private ArrayList<Product> allProducts;
    private ArrayList<String> features;

    public Category(String name, ArrayList<String> features,ArrayList<Product> allProducts) {
        this.name = name;
        allCategories = new ArrayList<Category>();
        subCategories = new ArrayList<Category>();
        this.features = features;
        this.allProducts = allProducts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void setAllCategories(ArrayList<Category> allCategories) {
        Category.allCategories = allCategories;
    }

    public static ArrayList<Category> getAllCategories() {
        return allCategories;
    }

    public void setAllProducts(ArrayList<Product> allProducts) {
        this.allProducts = allProducts;
    }

    public ArrayList<Product> getAllProducts() {
        return allProducts;
    }

    public static void setSubCategories(ArrayList<Category> subCategories) {
        Category.subCategories = subCategories;
    }

    public static ArrayList<Category> getSubCategories() {
        return subCategories;
    }

    public void setFeatures(ArrayList<String> features) {
        this.features = features;
    }

    public ArrayList<String> getFeatures() {
        return features;
    }
}
