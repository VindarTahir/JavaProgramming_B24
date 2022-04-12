package day24_loops;

import java.util.Scanner;

public class UniqueCharacter {

    public static void main(String[] args) {

        /*

            Ask for a word
            ask for a letter .next.charAt()

            is the letter unique in the word
                only 1 time in the word

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word!");
        String word = input.next();

        System.out.println("Enter a letter");
        char letter = input.next().charAt(0);
        int count = 0;

        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == letter){
                count++;
            }

        }
        if (count < 2){
            System.out.println("This is a unique letter");
        } else {
            System.out.println("This is not a unique letter");
        }
        System.out.println(letter + " was found " + count + " times");

    }
}
