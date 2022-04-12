package day09_scanner_logical;

import java.util.Scanner;

public class Angles {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /*
            180 - Triangle
            360 - Circle

            3 angles
         */

        System.out.println("Enter 3 angles: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        String msg = num1 + " + " + num2 + " + " + num3 + " = ";

        System.out.println(msg + (num1 + num2 + num3));

       double sum = num1 + num2 + num3;

       boolean isTriangle = sum == 180;
       boolean isCircle = sum == 360;

        System.out.println("Is this a triangle: " + isTriangle);
        System.out.println("Is this a circle: " + isCircle);



    }



}
