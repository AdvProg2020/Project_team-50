package Model;

import java.util.ArrayList;

public class Comment {
    private Shopper shopper;
    private Product product;
    private String commentText;
    //status
    private boolean didShopperBuyTheProduct;
    private ArrayList<Comment> allComment = new ArrayList<Comment>();

    public Comment(Shopper shopper, Product product, String commentText, boolean didShopperBuyTheProduct) {
        this.shopper = shopper;
        this.product = product;
        this.commentText = commentText;
        this.didShopperBuyTheProduct = didShopperBuyTheProduct;
        allComment.add(this);
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public String getCommentText() {
        return commentText;
    }

    public boolean didShopperBuyTheProduct(Shopper shopper){
        //TODO
    }

    @Override
    public String toString() {
        return "Comment{" +
                "shopper=" + shopper +
                ", product=" + product +
                ", commentText='" + commentText + '\'' +
                ", didShopperBuyTheProduct=" + didShopperBuyTheProduct +
                '}';
    }
}
