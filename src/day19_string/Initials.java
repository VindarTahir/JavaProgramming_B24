package day19_string;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        /*

            Ask the user to enter there first name
            Ask the user to enter there last name
            Then print the initials j bond - > jb -> as uppercase

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next();
        System.out.println("Enter your last name");
        String lastName = input.next();

        String initial = "" + firstName.charAt(0) + lastName.charAt(0);

        System.out.println(initial.toUpperCase());
    }
}
