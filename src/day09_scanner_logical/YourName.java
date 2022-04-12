package day09_scanner_logical;

import java.util.Scanner;

public class YourName {

    public static void main(String[] args) {

        /*
            Ask the user to enter their first name
            Ask the user to enter their last name
            print the full name

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String first = input.nextLine();
        System.out.println("Enter your last name: ");
        String last = input.nextLine();

        System.out.println("Your name is " + first + " " + last);


    }



}
