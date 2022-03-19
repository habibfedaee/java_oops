package com.syntax.class26;

public class ShoppingTester {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setDiscount(.20);
        cart.calcPrice();
    }
}
