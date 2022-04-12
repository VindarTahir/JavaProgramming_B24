package day18_string;

import java.util.Locale;

public class RecapMethods {

    public static void main(String[] args) {

        String day = "THUrsday";

       boolean b = day.equals("thursday");

        System.out.println(b);

        System.out.println(day.equalsIgnoreCase("Thursday"));

       day = day.toUpperCase();

        System.out.println(day);
        System.out.println(day.toLowerCase());
        System.out.println(day);

        System.out.println(day.length() + 1); // 8(int) + 1 (int) -> 9
        System.out.println(day); // THURSDAY

        // day = day.length(); length method returns int and we are trying to store String
        day = day.length() + ""; // types: int + String -> Concatenation -> String type back values of "8"
        System.out.println(day + 2); // String + int -> concatenation -> "8" + 2 -> "82"

        System.out.println("5 + 2 = " + 5 + 2);
        System.out.println("5 + 2 = " + (5 + 2));

    }
}
