package day26_recap;

import java.util.Scanner;

public class SpaceProgram {

    /*

Space program [String, Loops]

Given a String return a version of with spaces between all of the letters.
If there is already a space in the String put an underscore

	Ex: java	-> j a v a
		space 	-> s p a c e
		more words -> m o r e _ w o r d s
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word or words");
        String s = input.nextLine().trim();

        String spaceResult = "";

        for (int i = 0; i < s.length(); i++){

            // Think of i as each letter of the string, every loop, it goes to the next character
            if (s.charAt(i) == ' '){
                spaceResult += "_ ";
            } else {
                spaceResult += s.charAt(i) + " ";
            }
        }

        System.out.println(spaceResult.trim());
    }
}
