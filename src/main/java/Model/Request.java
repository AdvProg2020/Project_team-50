package Model;

import java.util.ArrayList;

public class Request {
    private String requestId;
    private Seller seller;
    private RequstType requstType;
    private ArrayList<Request> allRequests = new ArrayList<Request>();;

    public Request(String requestId, Seller seller) {
        this.requestId = requestId;
        this.seller = seller;
        //status
        allRequests.add(this);
    }

    public static Request getRequestById(String requestId){
        //TODO
    }

    public static boolean hasRequestById(String requestId){
        //TODO
    }

    public static void deleteRequestById(Request request){
        //TODO
    }

    public void setRequstType(RequstType requstType) {
        this.requstType = requstType;
    }

    public RequstType getRequstType() {
        return requstType;
    }
}
