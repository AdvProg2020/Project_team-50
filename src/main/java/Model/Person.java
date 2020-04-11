package Model;

import java.util.ArrayList;

public class Person {

    protected final String userName;
    protected String firstName;
    protected String lastName;
    protected String eMail;
    protected String phoneNumber;
    protected String password;
    public ArrayList<Person> allPerson = new ArrayList<Person>();

    public Person(String userName, String firstName, String lastName, String eMail, String phoneNumber, String password) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }
}
