package personal;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        /*
        Ask the user to enter a year. Determine if the year is a leap year or not. You can assume a leap year is a year that is divisible by 4. Print true or false.

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");

        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        double sum = num1 + num2 + num3;

        System.out.println("Sum of numbers: " + sum );

    }


}
