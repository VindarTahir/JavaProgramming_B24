package day15_switch;

import java.util.Scanner;

public class Hotel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Java hotel");
        System.out.println("How many people in your party?");
        int numberOfPeople = input.nextInt();
        System.out.println("How many days will you stay");
        int numberOfDays = input.nextInt();
        boolean validPartySize = true;

        double price = 0;
        String roomType = "";
        String peopleMsg = "people";
        switch (numberOfPeople) {

            case 1:
                roomType = "Single room";
                 price = numberOfDays * 100;
                 peopleMsg = "person";
                 break;

            case 2:
                roomType = "Double room";
                price = numberOfDays * 125;
                break;

            case 3:
                roomType = "Large room";
                price = numberOfDays * numberOfPeople * 150;
                break;

            case 4:
                roomType = "Suite";
                price = 5000;
                break;

            default:
                System.out.println("Party size is too big");
                validPartySize = false;
                break;





        }
        if(validPartySize) {
            System.out.println("Okay great, for " + numberOfPeople + " " + peopleMsg + " staying for " + numberOfDays + " days, your total price is: $" + price + " for a " + roomType);

        }

    }
}
