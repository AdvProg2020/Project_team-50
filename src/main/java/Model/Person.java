package Model;

public class Person {
    private String userName;
    private String firstName;
    private String lastName;
    private String eMail;
    private int phoneNumber;
    private String passWord;

    public Person(String userName, String firstName, String lastName, String eMail, int phoneNumber, String passWord) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.passWord = passWord;
    }
}
