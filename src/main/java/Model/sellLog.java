package Model;

public class sellLog {
    private String idLog;
    private int date;
    private double receivedAmount;
    private String auctionAmount;
    private String productSold;
    private String nameOfShopper;
    private String submitStatus;
    public sellLog(String idLog, int date, double receivedAmount, String auctionAmount, String productSold, String nameOfShopper, String submitStatus) {
        this.idLog = idLog;
        this.date = date;
        this.receivedAmount = receivedAmount;
        this.auctionAmount = auctionAmount;
        this.productSold = productSold;
        this.nameOfShopper = nameOfShopper;
        this.submitStatus = submitStatus;
    }
}
