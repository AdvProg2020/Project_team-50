package model;

import model.Enum.RequstType;
import model.account.Seller;

import java.util.ArrayList;

public class Request {
    private final String requestId;
    private Seller seller;
    private RequstType requstType;
    private ArrayList<Request> allRequests = new ArrayList<Request>();;

    public Request(String requestId, Seller seller) {
        this.requestId = requestId;
        this.seller = seller;
        //status
        allRequests.add(this);
    }

    public String getRequestId() {
        return requestId;
    }

    public Seller getSeller() {
        return seller;
    }

    public ArrayList<Request> getAllRequests() {
        return allRequests;
    }

    public void setRequestType(RequstType requstType) {
        this.requstType = requstType;
    }

    public RequstType getRequestType() {
        return requstType;
    }
}
