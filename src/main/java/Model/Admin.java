package Model;

import java.util.ArrayList;

public class Admin extends Person {

    private ArrayList<Person> allPerson = new ArrayList<Person>();
    private ArrayList<Category> allCategories = new ArrayList<Category>();
    private ArrayList<Off> allOff = new ArrayList<Off>();


    public Admin(String userName, String firstName, String lastName, String eMail, String phoneNumber, String password) {
        super(userName, firstName, lastName, eMail, phoneNumber, password);
        allPerson.add(this);
    }
}
