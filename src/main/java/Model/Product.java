package Model;

import java.util.ArrayList;

public class Product {
    private String productId;
    //status
    private String name;
    private String factoryName;
    private int price;
    private Seller sellers;
    private boolean isExisting;
    private Category category;
    //مشخصات خاص دسته
    private String description;
    private ArrayList<Score> scores;
    private ArrayList<Comment> comments;
    private ArrayList<Product> products;

    public Product(String productId, String name, String factoryName, int price, Seller sellers, boolean isExisting, Category category, String description) {
        this.productId = productId;
        this.name = name;
        this.factoryName = factoryName;
        this.price = price;
        this.sellers = sellers;
        this.isExisting = isExisting;
        this.category = category;
        this.description = description;
        scores = new ArrayList<Score>();
        comments = new ArrayList<Comment>();
        products = new ArrayList<Product>();
        products.add(this);
    }
}
