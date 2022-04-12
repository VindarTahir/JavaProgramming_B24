package day33_multidimensional_array;

import java.util.Arrays;
import java.util.Scanner;

public class CreateMultiArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String [][] allWords = new String [4][];


        System.out.println("Enter multiple words seperated by a space");

        String [] first = input.nextLine().split(" ");  // Semi - manual way
        System.out.println(Arrays.toString(first));

        allWords[0] = first;

        System.out.println("Enter the next set of words");  // Most efficient way
        allWords[1] = input.nextLine().split(" ");

        System.out.println("Enter the last set of words");  // Most manual way
        String word = input.nextLine();
        String [] wordArr = word.split(" ");

        allWords[2] = wordArr;


        System.out.println(Arrays.deepToString(allWords));



    }
}
