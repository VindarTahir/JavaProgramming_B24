package day11_if_statements;

import java.util.Scanner;

public class Atm {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("*** Welcome to the Atm ***");
        System.out.println("Please enter your pin");

        int inputPin = input.nextInt();
        int validPin = 1234;

        if (inputPin == validPin) {
            // valid and logged in

            System.out.println("Logged in!");
            System.out.println("Select a number");
            System.out.println("\t1) Check balance");
            System.out.println("\t2) Deposit");
            System.out.println("\t3) Withdraw");
            int selection = input.nextInt();

            if (selection == 1) {
                int balance = 32_487;
                System.out.println("Your balance is $" + balance);

            }
            if (selection == 2) {

                System.out.println("How much money would you like to deposit?");

            }
            if (selection == 3){

                System.out.println("How much money would you like to withdraw?");

            }

        }
        else {
            System.out.println("Invalid passcode");
            System.out.println("Try again");

        }

        System.out.println("Thank you for using our bank, come again!");
    }



}
