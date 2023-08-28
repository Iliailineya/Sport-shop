package org.example;

public class SportShop {
    public static void main(String[] args) {
        TShirtBuilder tShirtBuilder = new TShirtBuilder();
        tShirtBuilder.setColor("Red");
        tShirtBuilder.setManufacturer("Active sports");
        tShirtBuilder.setPrice(15.99);
        TShirt redTShirt = tShirtBuilder.build();

        CapBuilder capBuilder = new CapBuilder();
        capBuilder.setColor("White");
        capBuilder.setManufacturer("Smart caps");
        capBuilder.setPrice(9.99);
        Cap whiteCap = capBuilder.build();

        Order orderA = new Order(redTShirt, whiteCap);
        orderA.printOrderDetails();
    }
}
