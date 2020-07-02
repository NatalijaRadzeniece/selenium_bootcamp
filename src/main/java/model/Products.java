package model;

import com.sun.jdi.FloatValue;

public class Products {
    private String productName;
    private float price;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPrice(String price) {
        String clearPrice = price.substring(1, price.length());
        this.price = Float.valueOf(clearPrice);
    }
}
