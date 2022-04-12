package day25_loops;

import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {

        /*
            String str = input.nextLine();
            str = str.trim();
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your sentence");

        String str = input.nextLine().trim();

        int numberOfSpaces = 0;

        for (int i = 0; i < str.length(); i++){

            if (str.charAt(i) == ' '){
                numberOfSpaces++;
            }
        }

        System.out.println("Number of words: " +(numberOfSpaces + 1));

        // without loop:

        int originialLength = str.length();
        int newLength = str.replace(" ", "").length();
        System.out.println("Number of words: " + (originialLength - newLength));










    }
}
