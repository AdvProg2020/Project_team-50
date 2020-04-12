package Model;

import java.util.ArrayList;

public class Shopper extends Person {
    private ArrayList<BuyLog> buyLogs = new ArrayList<BuyLog>();
    private Cart cart;

    public Shopper(String userName, String firstName, String lastName, String eMail, String phoneNumber, String password) {
        super(userName, firstName, lastName, eMail, phoneNumber, password);
        allPerson.add(this);
    }
}
