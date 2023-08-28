package org.exemple.shop.items;

import org.exemple.shop.myInterface.ItemBuilder;

public class TShirtBuilder implements ItemBuilder {
    private final TShirt tShirt = new TShirt();

    public TShirtBuilder setColor(String color) {
        tShirt.setColor(color);
        return this;
    }

    public TShirtBuilder setManufacturer(String manufacturer) {
        tShirt.setManufacturer(manufacturer);
        return this;
    }

    public TShirtBuilder setPrice(double price) {
        tShirt.setPrice(price);
        return this;
    }

    public TShirt build() {
        return tShirt;
    }

    public static TShirtBuilder create() {
        return new TShirtBuilder();
    }
}
