package day26_recap;

import java.util.Scanner;

public class CreateID {

    /*
        Create ID [String]

Given a first name and last name create and return an id using the following format:
	the first letter of the first name as lowercase,
	the first 3 letters of the last name with the first letter as uppercase and the rest lowercase,
	the length of the first String multiplied by 2

	first name: john
	last name: smith

	id: jSmi8
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String first = input.next().toLowerCase().trim();

        System.out.println("Enter your last name");
        String last = input.next().toLowerCase().trim();

        String specialID = first.substring(0,1).toLowerCase() + last.substring(0,1).toUpperCase() + last.substring(1,3).toLowerCase() + first.length() * 2;

        System.out.println("Your special ID is: " + specialID);

    }
}
