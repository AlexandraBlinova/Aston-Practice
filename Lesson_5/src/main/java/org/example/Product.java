package org.example;

public class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String country;
    private int price;
    private boolean available;

    public Product(String name, String productionDate, String manufacturer, String country, int price, boolean available) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.available = available;

    }

    public void getInfo(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            Product p = products[i];
            System.out.println("Product name: " + products[i].name +
                    ", Production date is " + products[i].productionDate +
                    ", Manufacturer is " + products[i].manufacturer +
                    ", Country is " + products[i].country +
                    ", Price is " + products[i].price +
                    ", Availability is " + products[i].available);
        }
    }
}
