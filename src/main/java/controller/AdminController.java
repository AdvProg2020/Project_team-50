package controller;

import model.*;
import model.account.Admin;
import model.account.Person;

import java.util.ArrayList;

public class AdminController extends Account {
    private Admin admin;

    public AdminController(Admin admin) {
        super(admin);
        this.admin = admin;
    }

    public void showPersonalInfo(){
        //TODO
    }

    public void changePersonalInfo(Admin admin, String field, String newInfo){
        //TODO
    }

    public ArrayList<Request> showRequestsList(){
        //TODO
    }

    public boolean acceptOrDecline(String requestId, boolean isAccepted){
        //TODO
    }

    public void addCodedDiscount(Admin admin){
        //TODO
    }

    public void editCodedDiscount(String discountId, String field, String newInfo){
        //TODO
    }

    public void deleteCodedDiscount(String discountId){
        //TODO
    }

    public ArrayList<CodedDiscount> showCodedDiscounts(){
        //TODO
    }

    public ArrayList<Person> showAllUsers(){
        //TODO
    }

    public void deleteUser(String userName){
        //TODO
    }

    public void addNewAdmin(){
        //TODO
    }

    public ArrayList<Category> showCategories(){
        //TODO
    }

    public void addCategory(String name, ArrayList<Product> productId){
        //TODO
    }

    public void editCategory(Category category, String field, String newInfo){
        //TODO
    }

    public void deleteCategory(String name){
        //TODO
    }
}
