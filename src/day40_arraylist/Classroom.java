package day40_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Classroom {

    public static void main(String[] args) {

        ArrayList<String> group1 = new ArrayList<>();
        System.out.println(group1);
        System.out.println(group1.size());  // how many elements is there

        group1.add("Vindar");
        group1.add("James Bond");
        group1.add("Tach");
        group1.add("Topcu");
        System.out.println(group1);

        System.out.println("First element: " + group1.get(0));
        System.out.println("Second element: " + group1.get(1));
        System.out.println("Third element: " + group1.get(2));
        System.out.println("Fourth element: " + group1.get(3));

        System.out.println("First element, first char: " + group1.get(0).charAt(0));


        // capacity example
        ArrayList<String> group2 = new ArrayList<>(20);
        System.out.println(group2.size());

        ArrayList<String> group3 = new ArrayList<>();
        group3.add("Nisso");            // [Nisso,]
        group3.add(0, "Omer"); // [Omer, Nisso ]
        group3.add("Kamila");               // [Omer, Nisso, Kamila, ]
        group3.add(0, "Bogdan"); // [Bogdan, Omer, Nisso, Kamila ]
        group3.add(1, "James"); // [Bogdan, James, Omer, Nisso, Kamila ]
        group3.add(5, "Nani");


        System.out.println(group3);



    }
}
