package ru.geekbrains.oop.lesson1.sample;

import ru.geekbrains.oop.lesson1.Product;

public class Chocolate extends Product {

    private double calories;
    private  double weight;
    public Chocolate(String brand, String name, double price,  double weight, double calories) {
        super(brand, name, price);
        this.calories = calories;
        this.weight = weight;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String displayInfo() {
        return String.format("Шоколад с орехами:\n\tбранд: %s\n\tназвание: %s\n\tцена: %.2f\n\tвес: %.2f\n\tкалорий: %.2f",
                brand, name, price, weight, calories);
    }


}
