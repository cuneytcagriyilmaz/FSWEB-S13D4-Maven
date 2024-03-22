package org.example.enums;

public enum Plan {
    BASIC(100, "Temel Plan"),
    PREMIUM(200, "Premium Plan");

    private int price;
    private String name;

    Plan(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
