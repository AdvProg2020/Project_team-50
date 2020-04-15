package model;

import model.account.Shopper;

public class Score {
    private Shopper shopper;
    private Product product;
    private double rating;

    public Score(Shopper shopper, Product product, double rating) {
        this.shopper = shopper;
        this.product = product;
        this.rating = rating;
    }

    public static boolean canShopperRateThisProduct(Shopper shopper){
        //TODO
    }

    public static double calculateAverageScore(Product product){
        //TODO
    }
}
