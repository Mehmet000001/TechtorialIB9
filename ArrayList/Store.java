package ArrayList;


import java.util.ArrayList;
import java.util.List;


public class Store {
    public static void main(String[] args) {
        Computer computer1 = new Computer("apple", "pro", 2300, 16);
        Computer computer2 = new Computer("HP", "Envy", 1600, 15);
        Computer computer3 = new Computer("Lenova", "thikpad", 1500, 14);
        Computer computer4 = new Computer("apple", "air", 1100, 13);
        ArrayList<Computer> devices = new ArrayList<>();
        devices.add(computer1);
        devices.add(computer2);
        devices.add(computer3);
        devices.add(computer4);
        System.out.println(devices);
        for (Computer computer : devices) {
            System.out.println(computer);
        }
        for (Computer computer : devices) {
            if (computer.make.equalsIgnoreCase("apple"))//show it only apple
            System.out.println(computer.model);
        }
        for (Computer computer : devices) {
            System.out.println(computer.make);
        }
        for (Computer computer : devices) {
            System.out.println(computer.price);
        }

    }
}
