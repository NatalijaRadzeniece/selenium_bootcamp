package model;

public class Article {

    private String title;
    private Integer commentNumber;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCommentNumber() {
        return commentNumber;
    }

    public void setCommentNumber(Integer commentNumber) {
        this.commentNumber = commentNumber;
    }
    public void setCommentNumber(String commentNumber){
        String clearNumber = commentNumber.substring(1,commentNumber.length()-1);
        this.commentNumber = Integer.valueOf(clearNumber);
    }






}
