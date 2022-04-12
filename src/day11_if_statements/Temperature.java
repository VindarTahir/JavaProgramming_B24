package day11_if_statements;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the temperature today?");
        int temp = input.nextInt();


        if (temp >= 70){

            System.out.println("It's a nice day");
            System.out.println("Maybe go for a picnic");

        }
        else {

            System.out.println("It is cold");
            System.out.println("Stay home and write java code");

        }




    }


}
