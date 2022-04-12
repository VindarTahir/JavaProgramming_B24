package day45_custom_constructors;

import day34_methods.Car;

public class Store {

    public static void main(String[] args) {

        Carpet carpet = new Carpet(10, 4, 0.5, false);
        System.out.println(carpet);

        System.out.println();

        Carpet carpet2 = new Carpet(20, 7, 0.7, true);
        System.out.println(carpet2);
    }
}
