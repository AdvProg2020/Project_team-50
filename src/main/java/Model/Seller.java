package Model;

import java.util.ArrayList;

public class Seller extends Person {
    private String factoryName;
    public ArrayList<Product> allProducts = new ArrayList<Product>();
    public ArrayList<Off> allOffers = new ArrayList<Off>();

    public Seller(String userName, String firstName, String lastName, String eMail, String phoneNumber, String password, String factoryName) {
        super(userName, firstName, lastName, eMail, phoneNumber, password);
        this.factoryName = factoryName;
        allPerson.add(this);
    }
}
