package Model;

import java.util.ArrayList;

public class Shopper extends Person {
    private double credit;
    private ArrayList<BuyLog> buyLogs = new ArrayList<BuyLog>();
    private ArrayList<Product> cart;

    public Shopper(String userName, String firstName, String lastName, String eMail, String phoneNumber, String password, double credit) {
        super(userName, firstName, lastName, eMail, phoneNumber, password);
        this.credit = credit;
        cart = new ArrayList<Product>();
        allPerson.add(this);
    }

    public void showPersonalAccountInfo(){
        //TODO
    }

    public void changePersonalInfo(){
        //TODO
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void showProducts(String productId){
        //TODO
    }

    public  void buy(){
        //TODO
    }

    public boolean doesHaveEnoughCriditToBuyProduct(double credit){
        //TODO
    }

}