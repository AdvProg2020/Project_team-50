package Model;

public class Shopper extends Person {


    public Shopper(String userName, String firstName, String lastName, String eMail, String phoneNumber, String password) {
        super(userName, firstName, lastName, eMail, phoneNumber, password);
        allPerson.add(this);
    }
}
