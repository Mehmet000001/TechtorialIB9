package ArrayList;

import java.util.ArrayList;

public class Flower {
    /*
    TASK:
Part 1- Create one Flower class with following instance variables
name, color, size(small, medium, large), price
Create the constructor to instantiate the instance variables.
Part 2- Create FlowerTest class and create one arraylist to store the flower object.
Inside the arraylist store 5 flower object. Print sum of the prices for all object from the arraylist.

     */
    String name;
    String color;
    String size;
    double price;

    public Flower(String name, String color, String size, double price) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Name is: " + name + "color is :" + color + "Size is :" + size + "Price is: " + price;
    }

    public static double getSumFlowersPrice(ArrayList<Flower> flowersN) {
        int sum = 0;
        for (Flower flower : flowersN) {
            sum+=flower.price;
        }
        return sum;
    }
}

