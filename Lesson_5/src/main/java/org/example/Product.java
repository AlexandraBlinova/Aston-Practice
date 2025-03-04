package org.example;

public class Product {
    private String name;
    private String productiondDate;
    private String manufacturer;
    private String country;
    private int price;
    private boolean available;

    public Product(String name, String productionDate, String manufacturer, String country, int price, boolean available) {
        this.name = name;
        this.productiondDate = productionDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.available = available;
        getInfo(name, productionDate, manufacturer, country, price, available);
    }

    public static void getInfo(String name, String productionDate, String manufacturer, String country, int price, boolean available) {
        System.out.println("Product name: " + name +
                ", Production date is " + productionDate +
                ", Manufacturer is " + manufacturer +
                ", Country is " + country +
                ", Price is " + price +
                ", Availability is " + available);
    }
}
