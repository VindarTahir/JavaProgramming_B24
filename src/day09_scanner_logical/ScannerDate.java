package day09_scanner_logical;

import java.util.Scanner;


public class ScannerDate {

    public static void main(String[] args) {

        /*
            Ask the user to enter the month number
            Ask the user to enter the day number
            Ask the user to enter the year number

            8/7/2021
         */

            Scanner input = new Scanner(System.in);
        System.out.println("Enter the month number: ");
        int monthNumber = input.nextInt();
        System.out.println("Enter the day number: ");
        int dayNumber = input.nextInt();
        System.out.println("Enter the year: ");
        int year = input.nextInt();
        System.out.println("Today's date is: " + monthNumber + "/" + dayNumber + "/" + year);



    }



}
