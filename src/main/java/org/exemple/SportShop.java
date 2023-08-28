package org.exemple;


import org.exemple.shop.Order;
import org.exemple.shop.items.CapBuilder;
import org.exemple.shop.items.TShirtBuilder;
import org.exemple.shop.myInterface.Product;

public class SportShop {
    public static Order customerOrder(String tShirtColor, String capColor) {
        Product redTShirt = createTShirt(tShirtColor);
        Product whiteCap = createCap(capColor);

        return new Order(redTShirt, whiteCap);
    }

    private static Product createTShirt(String color) {
        return TShirtBuilder.create()
                .setColor(color)
                .setManufacturer("Active sports")
                .setPrice(15.99)
                .build();
    }

    private static Product createCap(String color) {
        return CapBuilder.create()
                .setColor(color)
                .setManufacturer("Smart caps")
                .setPrice(9.99)
                .build();
    }
}
