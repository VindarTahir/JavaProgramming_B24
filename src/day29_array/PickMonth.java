package day29_array;

import java.util.Scanner;

public class PickMonth {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
            Ask the user to enter a month number
            Print which month they select
            1 -> January
            ..
            12 -> December
         */

        String [] month = {
                "Jan", "Feb", "March","April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"
        };

        System.out.println("Enter a month number");
        int num = input.nextInt();

        System.out.println("The month you picked is: " + month[num - 1]);
    }
}
