package org.example;

import java.util.Objects;

public final class Cap {
    private String color;
    private String manufacturer;
    private double price;

    public Cap() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Cap) obj;
        return Objects.equals(this.color, that.color) &&
                Objects.equals(this.manufacturer, that.manufacturer) &&
                Double.doubleToLongBits(this.price) == Double.doubleToLongBits(that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, manufacturer, price);
    }

    @Override
    public String toString() {
        return "Cap[" +
                "color=" + color + ", " +
                "manufacturer=" + manufacturer + ", " +
                "price=" + price + ']';
    }

}
