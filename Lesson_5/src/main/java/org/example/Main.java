package org.example;

public class Main {
    public static void main(String[] args) {
        Product[] productsArr = new Product[5];
        productsArr[0] = new Product("Car", "13.04.2019", "Toyota", "Japan", 230, true);
        productsArr[1] = new Product("Car", "01.11.1995", "Hyundai", "South Korea", 245, true);
        productsArr[2] = new Product("Car", "22.03.2023", "Volkswagen", "Germany", 130, false);
        productsArr[3] = new Product("Car", "08.04.2002", "Audi", "Germany", 210, true);
        productsArr[4] = new Product("Car", "18.02.2003", "Nissan", "Japan", 500, true);

        productsArr[0].getInfo(productsArr);


        Park park = new Park();
        Park.Attraction rollerCoaster = park.new Attraction("Американские горки", "10:00 - 22:00", 20.0);
        rollerCoaster.displayInfo();

    }
}
