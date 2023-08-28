package org.example;

public class Main {
    public static void main(String[] args) {
        demoRun();
    }

    public static void demoRun(){
        Order orderA = SportShop.customerOrder("Red", "White");
        orderA.printOrderDetails();
        Order orderB = SportShop.customerOrder("Blue", "Black");
        orderB.printOrderDetails();
    }
}