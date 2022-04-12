package day18_string;

import java.util.Scanner;

public class Websites {

    /*

        Ask the user to type a website
        Check if the website is valid
            A website is valid if:
                begins with
                    www.
                Ends with .com / .edu / .gov / .net

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Type in a website");

        String website = input.nextLine();

        if (website.startsWith("www.") && website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov") || website.endsWith(".net")) {
            System.out.println("This is a valid website");
        } else {
            System.out.println("Not valid");
        }

    }
}
