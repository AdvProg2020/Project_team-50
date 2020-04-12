package Model;

public class Comment {
    private Person person;
    private Product product;
    private String commentText;
    //status
    private boolean didCommenterBuyTheProduct;

    public Comment(Product product, String commentText) {
        this.product = product;
        this.commentText = commentText;
    }
}
