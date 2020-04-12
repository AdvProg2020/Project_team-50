package Model;

import java.util.ArrayList;

public class Request {
    private String requestId;
    private Seller seller;
    //status
    private ArrayList<Request> allRequests;

    public Request(String requestId, Seller seller) {
        this.requestId = requestId;
        this.seller = seller;
        //status
        allRequests = new ArrayList<Request>();
    }
}
