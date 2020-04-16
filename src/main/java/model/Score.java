package model;

import model.account.Shopper;

public class Score {
    private Shopper shopper;
    private final Product product;
    private double rating;

    public Score(Shopper shopper, Product product, double rating) {
        this.shopper = shopper;
        this.product = product;
        this.rating = rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public Product getProduct() {
        return product;
    }
}
