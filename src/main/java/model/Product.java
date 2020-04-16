package model;

import model.Enum.ProductCondition;
import model.account.Seller;

import java.util.ArrayList;



public class Product {
    private final String productId;
    private ProductCondition productCondition;
    private String name;
    private String factoryName;
    private int price;
    private Seller sellers;
    private boolean isExisting;
    private Category category;
    private ArrayList<String> features;
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
        features = new ArrayList<String>();
        scores = new ArrayList<Score>();
        comments = new ArrayList<Comment>();
        products = new ArrayList<Product>();
        products.add(this);
    }

    public String getProductId() {
        return productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProductCondition(ProductCondition productCondition) {
        this.productCondition = productCondition;
    }

    public ProductCondition getProductCondition() {
        return productCondition;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFeatures(ArrayList<String> features) {
        this.features = features;
    }

    public ArrayList<String> getFeatures() {
        return features;
    }

    public void setScores(ArrayList<Score> scores) {
        this.scores = scores;
    }

    public ArrayList<Score> getScores() {
        return scores;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
