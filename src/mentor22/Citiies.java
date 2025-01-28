package mentor22;

import java.util.ArrayList;

public class Citiies {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Baku");
        cities.add("New York");
        cities.add("Ankara");

        System.out.println("Cities: " + cities);

        cities.remove(1);
        System.out.println("After remove: " + cities);

        boolean contains = cities.contains("Baku");
        System.out.println("Contains Baku? " + contains);

        System.out.println("Total cities: " + cities.size());

        System.out.println("Final cities: " + cities);

    }
}
