package Model;

import java.util.ArrayList;

public class Product {
    private String productId;
    //status
    private String name;
    private String factoryName;
    private int price;
    private ArrayList<Seller> sellers = new ArrayList<Seller>();
    private ArrayList<Shopper> shoppers = new ArrayList<Shopper>();
    private boolean isExisting;
    private Category category;
    //مشخصات خاص دسته
    private String description;
    private ArrayList<Score> scores = new ArrayList<Score>();
    private ArrayList<Comment> Comments;

    public Product(String productId, String name, String factoryName, int price, Category category) {
        this.productId = productId;
        this.name = name;
        this.factoryName = factoryName;
        this.price = price;
        this.category = category;
    }
}
