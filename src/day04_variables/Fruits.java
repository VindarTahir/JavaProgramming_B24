package day04_variables;

public class Fruits {

    public static void main(String[] args) {

        int apples = 10;
        int grapes = 15;
        int bananas = 20;

        // If something is gray in Intellij, it means it's not being used, ex. below

        int tomato = 5;

        System.out.println("Number of apples: " + apples);
        System.out.println("Number of grapes: " + grapes);
        System.out.println("Number of bananas: " + bananas);

        int totalNumberOfFruits = apples + bananas + grapes;

        System.out.println("\nTotal Number Of Fruits: " + totalNumberOfFruits);

        // soutv -> shortcut to print variables

            apples = 50; // Reassigned the apples to have a value of 50
            totalNumberOfFruits = apples + bananas + grapes; // Reassigned and counted again


        // We got a new shipment and now we have 50 apples
            System.out.println("\nWait, we got a new shipment coming in!");
            System.out.println("Number of apples: " + apples);
            System.out.println("Number of grapes: " + grapes);
            System.out.println("Number of bananas: " + bananas);
            System.out.println("\nThe new total number of fruits = " + totalNumberOfFruits);




    }



}
