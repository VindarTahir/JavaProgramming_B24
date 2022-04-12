package day25_loops;

import java.util.Scanner;

public class CountCharacters {

    public static void main(String[] args) {
        /*
            Given a String, find and print how many uppercase letters, lowercase, and number are in the String.
         */

        Scanner input = new Scanner(System.in);

        int upper = 0;
        int lower = 0;
        int number = 0;

        System.out.println("Please enter a String");
        String given = input.nextLine();

        for (int i = 0; i < given.length(); i++){

            char eachChar = given.charAt(i);

            if (eachChar >= 'A' && eachChar <= 'Z'){
                upper++;
            }
            else if (eachChar >= 'a' && eachChar <= 'z'){
                lower++;
            }
            else if (eachChar >= '0' && eachChar <= '9'){
                number++;
            } else {
                System.out.println("Not a valid char for this practice :'(");
            }
        }

        System.out.println("Number of upper: " + upper + "\nNumber of lower: " + lower + "\nNumber of numbers: " + number);

    }
}
