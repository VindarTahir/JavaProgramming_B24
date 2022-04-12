package day10_scanner;

import java.util.Scanner;

public class ChangeMachine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int userMoney, quarters, dimes, nickels, pennies;

        System.out.println("Hello, welcome to the change machine!");
        System.out.println("Please enter your cents from 1-99");
        userMoney = input.nextInt(); // 83

        quarters = userMoney / 25; // 83 / 25 -> 3 | 83 - 75 = 8
        userMoney %= 25;    // 8
        dimes = userMoney / 10; // 8 / 10 -> 0
        userMoney %= 10;
        nickels = userMoney / 5; // 8 / 5 -> 1 | 8 - 5 = 3
        userMoney %= 5; // 3
        pennies = userMoney;

        System.out.println("Your change is:");
        System.out.println("Quarters: " + quarters);
        System.out.println("dimes: " + dimes);
        System.out.println("nickels: " + nickels);
        System.out.println("pennies: " + pennies);

        input.close();






    }




}
