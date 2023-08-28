package org.example;

public class SportShop {
    public static Order customerOrder(String tShirtColor, String capColor) {
        TShirt redTShirt = TShirtBuilder.create()
                .setColor(tShirtColor)
                .setManufacturer("Active sports")
                .setPrice(15.99)
                .build();

        Cap whiteCap = CapBuilder.create()
                .setColor(capColor)
                .setManufacturer("Smart caps")
                .setPrice(9.99)
                .build();

        return new Order(redTShirt, whiteCap);
    }
}

