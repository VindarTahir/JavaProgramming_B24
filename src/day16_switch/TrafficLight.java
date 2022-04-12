package day16_switch;

import java.util.Scanner;

public class TrafficLight {

    public static void main(String[] args) {

        boolean isGreen = true;
        String action = isGreen ? "Go" : "Stop";
        System.out.println(action);

        String name = "Nadir";
        String className = name.equals("Nadir") ? "Soft skills" : "Java";
        System.out.println(className);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = input.nextInt();
        System.out.println(number % 2 == 0 ? "Even number" : "Odd number");

        System.out.println("Enter a number one");
        double num1 = input.nextDouble();
        System.out.println("Enter number two");
        double num2 = input.nextDouble();

        double max = num1 > num2 ? num1 : num2;
        System.out.println(max);

    }
}
