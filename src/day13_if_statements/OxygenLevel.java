package day13_if_statements;

import java.util.Scanner;

public class OxygenLevel {

    public static void main(String[] args) {

        /*
            You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level

Above 90 - Your tank is full
Above 80 - Still okay
Above 70 - Don't go too far
Above 60 - Start to head back
Above 50 - Be careful now you at at 50%
         */

        Scanner input = new Scanner(System.in);

        System.out.println("What is your oxygen tank level at?");
        int tankLevel = input.nextInt();

        if(tankLevel >= 90){
            System.out.println("Your tank is full");
        }
        else if (tankLevel >= 80 && tankLevel < 90){
            System.out.println("Your still okay");
        }
        else if (tankLevel >= 70 && tankLevel < 80){
            System.out.println("Don't go too far");
        }
        else if (tankLevel >= 60 && tankLevel < 70){
            System.out.println("Start heading back");
        }
        else if (tankLevel >= 50 && tankLevel < 60){
            System.out.println("Be careful, you are now starting to approach dangerous levels");
        }
        else {
            System.out.println("Below 50%");
        }
    }
}
