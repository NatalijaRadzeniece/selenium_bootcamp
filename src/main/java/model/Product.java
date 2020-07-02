package model;

import static jdk.nashorn.internal.objects.NativeMath.round;

public class Product {


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

    public void setPrice(String price) {
        this.price = Double.parseDouble(price.substring(1));
    }

}
