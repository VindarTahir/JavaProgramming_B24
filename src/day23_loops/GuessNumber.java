package day23_loops;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        /*
            There is a predefined
            1 - 100
            We want the user to guess

            80

            -> 50
                50 is too small
            -> 90
                90 is too big

         */
        Scanner input = new Scanner(System.in);

        int secretNumber = 80;
        int guess = 0;

        do{
            System.out.println("Guess a number");
            guess = input.nextInt();

            if(guess < secretNumber){
                System.out.println(guess + " is too small!");
            }
            if (guess == secretNumber){
                System.out.println("Congratulations! You guessed the number!");
            } if(guess > secretNumber) {
                System.out.println(guess + " is too big!");
            }
        }while (guess != secretNumber);


    }
}
