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
    public ArrayList<CodedDiscount> codedDiscounts = new ArrayList<CodedDiscount>();
    public ArrayList<BuyLog> buyLogs = new ArrayList<BuyLog>();
    public ArrayList<SellLog> sellLogs = new ArrayList<SellLog>();

    public Person(String userName, String firstName, String lastName, String eMail, String phoneNumber, String password) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.password = password;
        allPerson.add(this);
    }

    public static Person getPersonByUserName(String userName){
        //TODO
    }

    public boolean isTherePersonWithUserName(String userName){
        //TODO
    }

    public static void deleteAccount(Person person){
        //TODO
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String geteMail() {
        return eMail;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", eMail='" + eMail + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
