package day17_string;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {

        String name = "james";
        System.out.println(name.equals("james")); // True

        System.out.println(name.equals("James")); // False

        System.out.println(name.equalsIgnoreCase("James")); // True

        System.out.println(name.equalsIgnoreCase("jAmEs")); // True

        System.out.println(name.toUpperCase()); // JAMES

        System.out.println(name); // james

        String lastName = "Bond";

        lastName = lastName.toUpperCase();

        System.out.println(lastName); // BOND

        System.out.println(lastName.toLowerCase()); // bond

        System.out.println(lastName); // BOND

        String word = "Monday ";

        int length = word.length();

        System.out.println(length); // 7


    }
}
