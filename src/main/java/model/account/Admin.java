package model.account;

import model.Category;
import model.CodedDiscount;
import model.Off;
import model.Request;

import java.util.ArrayList;

public class Admin extends Person {
    private ArrayList<Category> allCategories;
    private ArrayList<Off> allOff;
    private ArrayList<Request> allRequests;


    public Admin(String userName, String firstName, String lastName, String eMail, String phoneNumber, String password) {
        super(userName, firstName, lastName, eMail, phoneNumber, password);
        allCategories = new ArrayList<Category>();
        allOff = new ArrayList<Off>();
        allRequests = new ArrayList<Request>();
        allPerson.add(this);
    }

    public ArrayList<Request> getAllRequests() {
        return allRequests;
    }

}
