package day29_array;

import java.util.Arrays;

public class ArrayIntro {

    public static void main(String[] args) {
        // Manual / old way to have alot of info

        String city1 = "San Fransisco";
        String city2 = "Moscow";
        String city3 = "Madison";
        String city4 = "Tokyo";
        String city5 = "Baghdad";

        // This is the array to hold multiple data

        String[] cities = {"San Fransisco", "Moscow", "Madison", "Tokyo", "Baghdad"};
        // has a index position    0             1          2         3         4

        // how to read each individual city / element

        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);

        // How do we know the number of cities / number of elements

        System.out.println(cities.length);

        // How can we print the whole array at one time

        System.out.println(cities); // this doesn't give us the values
        System.out.println(Arrays.toString(cities)); // this will print out the values

    }
}
