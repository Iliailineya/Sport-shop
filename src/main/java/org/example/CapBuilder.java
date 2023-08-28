package org.example;

public class CapBuilder implements ItemBuilder {
    private final Cap cap = new Cap();

    @Override
    public void setColor(String color) {
        cap.setColor(color);
    }

    @Override
    public void setManufacturer(String manufacturer) {
        cap.setManufacturer(manufacturer);
    }

    @Override
    public void setPrice(double price) {
        cap.setPrice(price);
    }

    public Cap build() {
        return cap;
    }
}