package Model;

public class buyLog {
    private String idLog;
    private int date;
    private double amountPaid;
    private String codedDiscount;
    private String boughtProducts;
    private String nameOfSeller;
    private String deliveryStatus;
    public buyLog(String idLog, int date, double amountPaid, String codedDiscount, String boughtProducts, String nameOfSeller, String deliveryStatus) {
        this.idLog = idLog;
        this.date = date;
        this.amountPaid = amountPaid;
        this.codedDiscount = codedDiscount;
        this.boughtProducts = boughtProducts;
        this.nameOfSeller = nameOfSeller;
        this.deliveryStatus = deliveryStatus;
    }
}
