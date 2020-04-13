package Model;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

import java.util.ArrayList;

public class Category {
    private String name;
    public static ArrayList<Category> allCategories;
    public static ArrayList<Category> subCategories;
    private ArrayList<Product> allProducts;
    //ویژگی های مخصوص


    public Category(String name, ArrayList<Product> allProducts) {
        this.name = name;
        allCategories = new ArrayList<Category>();
        subCategories = new ArrayList<Category>();
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
}
