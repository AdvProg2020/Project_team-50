package Model;

public class Comment {
    private Person person;
    private Product product;
    private String commentText;
    //status
    private boolean didCommenterBuyTheProduct;

    public Comment(Person person, Product product, String commentText, boolean didCommenterBuyTheProduct) {
        this.person = person;
        this.product = product;
        this.commentText = commentText;
        this.didCommenterBuyTheProduct = didCommenterBuyTheProduct;
    }
}
