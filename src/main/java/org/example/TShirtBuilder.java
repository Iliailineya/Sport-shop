package org.example;

public class TShirtBuilder implements ItemBuilder {
    private final TShirt tShirt = new TShirt();

    @Override
    public void setColor(String color) {
        tShirt.setColor(color);
    }

    @Override
    public void setManufacturer(String manufacturer) {
        tShirt.setManufacturer(manufacturer);
    }

    @Override
    public void setPrice(double price) {
        tShirt.setPrice(price);
    }

    public TShirt build() {
        return tShirt;
    }
}
