package model;

public class Article {

    private String title;
    private int commentNumber;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCommentNumber() {
        return commentNumber;
    }

    public void setCommentNumber(int commentNumber) {
        this.commentNumber = commentNumber;
    }

    public void setCommentNumber(String commentNumber){
        String clearNumber = commentNumber.substring(1,commentNumber.length()-1);
        this.commentNumber = Integer.valueOf(clearNumber);
//        or
//        this.commentNumber = Integer.valueOf(commentNumber.substring(0,commentNumber.length()-1);
    }
}
