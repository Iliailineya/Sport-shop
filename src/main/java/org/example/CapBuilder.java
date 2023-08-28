package org.example;

public class CapBuilder implements ItemBuilder {
    private final Cap cap = new Cap();

    public CapBuilder setColor(String color) {
        cap.setColor(color);
        return this;
    }

    public CapBuilder setManufacturer(String manufacturer) {
        cap.setManufacturer(manufacturer);
        return this;
    }

    public CapBuilder setPrice(double price) {
        cap.setPrice(price);
        return this;
    }

    public Cap build() {
        return cap;
    }

    public static CapBuilder create() {
        return new CapBuilder();
    }
}