package model;

public class Item {

    private String cartItemTitle;
    private Double cartItemPrice;

    public String getCartItem() {
        return cartItemTitle;
    }

    public void setCartItem(String cartItem) {
        this.cartItemTitle = cartItem;
    }

    public Double getCartItemPrice() {
        return cartItemPrice;
    }

    public void setCartItemPrice(Double cartItemPrice) {
        this.cartItemPrice = cartItemPrice;
    }
}

