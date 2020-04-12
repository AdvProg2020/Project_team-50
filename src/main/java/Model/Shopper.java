package Model;

import java.util.ArrayList;

public class Shopper extends Person {
    private ArrayList<BuyLog> buyLogs = new ArrayList<BuyLog>();
    private ArrayList<Product> cart;

    public Shopper(String userName, String firstName, String lastName, String eMail, String phoneNumber, String password) {
        super(userName, firstName, lastName, eMail, phoneNumber, password);
        cart = new ArrayList<Product>();
        allPerson.add(this);
    }
}
