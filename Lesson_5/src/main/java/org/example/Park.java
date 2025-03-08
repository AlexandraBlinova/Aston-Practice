package org.example;

public class Park {

    public class Attraction {
        private String name;
        private String workHours;
        private double cost;

        public Attraction(String name, String workHours, double cost) {
            this.name = name;
            this.workHours = workHours;
            this.cost = cost;
        }

        public void displayInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workHours);
            System.out.println("Стоимость: " + cost);
        }
    }
}