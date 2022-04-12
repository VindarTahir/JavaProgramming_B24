package day09_scanner_logical;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        String msg = num1 + " + " + num2 + " + " + num3 + " = ";

        System.out.println(msg + (num1 + num2 + num3));



    }




}
