package org.exemple.shop;

import org.exemple.shop.myInterface.Product;

public class Order {
    private final Product tShirt;
    private final Product cap;

    public Order(Product tShirt, Product cap) {
        this.tShirt = tShirt;
        this.cap = cap;
    }

    public double calculateTotalPrice() {
        return tShirt.getPrice() + cap.getPrice();
    }

    public void printOrderDetails() {
        System.out.println("Order Details:");
        System.out.println("T-Shirt: " + tShirt.getColor() + ", " + tShirt.getManufacturer() + ", Price: $" + tShirt.getPrice());
        System.out.println("Cap: " + cap.getColor() + ", " + cap.getManufacturer() + ", Price: $" + cap.getPrice());
        System.out.println("Total Price: $" + calculateTotalPrice());
    }
}
