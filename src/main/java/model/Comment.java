package model;

import model.Enum.CommentCondition;
import model.account.Shopper;

import java.util.ArrayList;

public class Comment {
    private Shopper shopper;
    private Product product;
    private String commentText;
    private CommentCondition commentCondition;
    private boolean didShopperBuyTheProduct;
    private ArrayList<Comment> allComment = new ArrayList<Comment>();

    public Comment(Shopper shopper, Product product, String commentText, CommentCondition commentCondition, boolean didShopperBuyTheProduct) {
        this.shopper = shopper;
        this.product = product;
        this.commentText = commentText;
        this.commentCondition = commentCondition;
        this.didShopperBuyTheProduct = didShopperBuyTheProduct;
        allComment.add(this);
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentCondition(CommentCondition commentCondition) {
        this.commentCondition = commentCondition;
    }

    public CommentCondition getCommentCondition() {
        return commentCondition;
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
