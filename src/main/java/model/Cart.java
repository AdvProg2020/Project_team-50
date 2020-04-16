package model;

import model.account.Seller;

import java.util.HashMap;

public class Cart {
    private HashMap<Product, Seller> productSupplier;
    private HashMap<Product, Integer> numberOfProducts;
    private CodedDiscount codedDiscount;

    public Cart(){
        productSupplier = new HashMap<Product, Seller>();
        numberOfProducts = new HashMap<Product, Integer>();
        this.codedDiscount = null;
    }

    public void setProductSupplier(HashMap<Product, Seller> productSupplier) {
        this.productSupplier = productSupplier;
    }

    public HashMap<Product, Seller> getProductSupplier() {
        return productSupplier;
    }

    public void setNumberOfProducts(HashMap<Product, Integer> numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public HashMap<Product, Integer> getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setCodedDiscount(CodedDiscount codedDiscount) {
        this.codedDiscount = codedDiscount;
    }

    public CodedDiscount getCodedDiscount() {
        return codedDiscount;
    }
}
