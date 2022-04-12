package day13_if_statements;

import java.util.Scanner;

public class YesOrNo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name");

        String firstName = input.next();
        System.out.println(firstName + " do you like soccer");

        String likeSoccer = input.next();

        if (likeSoccer.equals("Yes") || likeSoccer.equals("yes")) {

            System.out.println(firstName + " who is your favorite team?");
            String team = input.next();

            System.out.println("Oh i like " + team + " too");
        } else if (likeSoccer.equals("No") || likeSoccer.equals("no")) {

            System.out.println("That's ok");

        } else {
            System.out.println(firstName + " you did not answer the question");
        }




    }


}
