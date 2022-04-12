package day22_loops;

import java.util.Arrays;
import java.util.Scanner;

public class MinAndMax {

    public static void main(String[] args) {
        /*
            write a program that asks the user to enter 5 numbers and returns the min number and max number
         */

        Scanner input = new Scanner(System.in);

        int count = 1; // keeps track of how many times we will run the loop
        int max = -2147483648; // 0
        int min = 2147483647;

        // 5

        while(count <= 5){
            count++;

            System.out.println("Enter a number: ");
            int numbers = input.nextInt();

            if (numbers > max) {
                max = numbers;

            }

            if (numbers < min){
                min = numbers;
            }



        }

        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);

        String str = "I love java";

        reverse2ndString(str);



    }

    public static void reverse2ndString(String str){

        /*
Reverse only second word
Given a String with three words separated by spaces. Reverse only the
second word and return the modified String
Ex:
I love java
I evol java
*/

        String [] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        int x = 0;
        String str2 = "";
        String str3 = "";

        for (int i = 0; i < arr.length; i++){

            if (i == 1){
                str2 = arr[i];
            }

        }

        for (int i = str2.length() - 1; i >= 0; i--){
            str3 += str2.charAt(i);
        }

        arr[1] = str3;
        String str4 = "";

        while (x < arr.length){
            str4 += arr[x];
            x++;
        }

        str4 = str4.replace("", " ");

        System.out.println(str4);

    }
}
