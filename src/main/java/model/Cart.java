package model;

import model.account.Seller;
import model.account.Shopper;

import java.util.HashMap;

public class Cart {
    private HashMap<Product, Integer> numberOfProducts;
    private Shopper shopper;

    public Cart(Shopper shopper){
        numberOfProducts = new HashMap<Product, Integer>();
        this.shopper = shopper;
    }

    public void increaseProduct(Product product) {
        int productValue = numberOfProducts.get(product);
        numberOfProducts.put(product, productValue+1);
    }

    public void decreaseProduct(Product product) {
        int productValue = numberOfProducts.get(product);
        numberOfProducts.put(product, productValue-1);
    }

    public void setNumberOfProducts(HashMap<Product, Integer> numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public HashMap<Product, Integer> getNumberOfProducts() {
        return numberOfProducts;
    }

}
