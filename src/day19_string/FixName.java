package day19_string;

import java.util.Scanner;

public class FixName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();

        System.out.println(firstName.indexOf(0));

        String firstNameFirstLetter = firstName.substring(0,1);
        String lastNameFirstLetter = lastName.substring(0,1);

        firstNameFirstLetter = firstNameFirstLetter.toUpperCase();
        lastNameFirstLetter = lastNameFirstLetter.toUpperCase();

        String remainingFirstName = firstName.substring(1);
        String remainingLastName = lastName.substring(1);




    }
    /*

        Ask the user to enter there first name
        Ask the user to enter there last name

        make sure the name is properly formatted

            Each first letter of both names is capital and the rest are lower case
     */






}
