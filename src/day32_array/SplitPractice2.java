package day32_array;

import java.util.Scanner;

public class SplitPractice2 {

    public static void main(String[] args) {

        // String input: 3 words
        // reverse the middle word
        // hello world java
        // hello dlrow java

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 words");
        String sentence = input.nextLine();
        input.close();

        String [] newSentence = sentence.split(" ");

        String reverse = "";

        for (int i = newSentence[1].length() - 1; i >= 0; i--){
                reverse += newSentence[1].charAt(i);

        }

        System.out.println(newSentence[0] + " " + reverse + " " + newSentence[2]);


    }
}
