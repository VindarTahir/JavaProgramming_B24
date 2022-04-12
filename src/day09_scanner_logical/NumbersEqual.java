package day09_scanner_logical;

import java.util.Scanner;


public class NumbersEqual {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /*
            Ask the user to enter 2 numbers
            and check if the numbers are equal
         */

        System.out.println("Enter a number: ");
        double number1 = input.nextDouble();

        System.out.println("Enter another number: ");
        double number2 = input.nextDouble();

        System.out.println(number1 + " is equal to " + number2 + " : " + (number1 == number2));



    }



}
