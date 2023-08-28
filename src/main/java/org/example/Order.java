package org.example;

public class Order {
    private final TShirt tShirt;
    private final Cap cap;

    public Order(TShirt tShirt, Cap cap) {
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