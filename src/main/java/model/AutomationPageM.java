package model;

public class AutomationPageM {

    private String title;
    private Double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public void setPrice (String price){
        String clearPrice = price.substring(1, price.length());
        this.price = Double.valueOf(clearPrice);
    }



}
