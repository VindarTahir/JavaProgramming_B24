package personal;

import java.util.Scanner;

public class FizzBuzz {

    /*
        Task: Evaulate your number and print based on the following:
    multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”. If the number is not disibile by any of those numbers print just the number

    Example:

        number = 5

        "FizzBuzz" -> when number is divisible by 3 and  5
        "Fizz" -> when number is divisible by 3
        "Buzz" -> when number is divisible by 5

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();

        if (number % 5 == 0 && number % 3 == 0) {

            System.out.println("FizzBuzz");

        } else if (number % 5 == 0 && number % 3 != 0) {
            System.out.println("Buzz");
        } else if (number % 3 == 0 && number % 5 != 0) {

            System.out.println("Fizz");
        } else {
            System.out.println(number);
        }


    }


}
