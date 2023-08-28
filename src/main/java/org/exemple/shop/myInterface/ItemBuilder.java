package org.exemple.shop.myInterface;

public interface ItemBuilder {
    ItemBuilder setColor(String color);

    ItemBuilder setManufacturer(String manufacturer);

    ItemBuilder setPrice(double price);
}
