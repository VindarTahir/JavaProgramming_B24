package day24_loops;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        /*
            Accept a String from the user
            Print palindrome or not palindroe

            String reverse = "" + word.charAt(2) + word.charAt(1) + word.charAt(0);


         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String s = input.next();
        String reverse = "";


        for (int index = s.length() - 1; index >= 0; index--){
            reverse += s.charAt(index);
        }
        if (reverse.equals(s)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
