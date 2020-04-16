package model.account;

import model.log.BuyLog;
import model.Cart;

import java.util.ArrayList;

public class Shopper extends Person {
    private double credit;
    private ArrayList<BuyLog> buyLogs = new ArrayList<BuyLog>();
    private Cart cart;

    public Shopper(String userName, String firstName, String lastName, String eMail, String phoneNumber, String password, double credit) {
        super(userName, firstName, lastName, eMail, phoneNumber, password);
        this.credit = credit;
        this.cart = new Cart();
        allPerson.add(this);
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Cart getCart() {
        return cart;
    }

    public boolean canBuy(){
        //TODO
    }

    public void setBuyLogs(ArrayList<BuyLog> buyLogs) {
        this.buyLogs = buyLogs;
    }

    public ArrayList<BuyLog> getBuyLogs() {
        return buyLogs;
    }

}