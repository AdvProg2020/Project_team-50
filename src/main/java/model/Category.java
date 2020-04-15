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

    public static boolean hasCategoryWithName(String name){
        //TODO
    }

    public void addNewCategory(){
        //TODO
    }

    public void addSubCategory(Category subCategories){
        //TODO
    }

    public void deleteSubCategory(Category subCategories){
        //TODO
    }

    public ArrayList<String> getFeatures() {
        return features;
    }
}
