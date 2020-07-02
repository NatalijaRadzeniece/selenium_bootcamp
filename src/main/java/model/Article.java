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

    public void setCommentNumber(String commentNumber) {
        //"(14456475)"
        //"14"
        //String clearNumber = commentNumber.substring(0, commentNumber.length()-1);
        this.commentNumber = Integer.valueOf(commentNumber.substring(1,commentNumber.length()-1));
    }

}
