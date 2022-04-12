package day22_loops;

import java.util.Scanner;

public class CalculateSum {

    public static void main(String[] args) {
        /*
            Write a program that calculagtes the sum of numbers entered by the user until the user enters a negative number
         */

        Scanner input = new Scanner(System.in);

        int sum = 1;
        boolean posNum = true;

        while (posNum) {

            System.out.println("Enter a number");
            int num = input.nextInt();
            sum += num;

            if (num < 0) {
                posNum = false;
            } else {
                sum += num;
            }

        }

        System.out.println("Sum: " + sum);
    }
}
