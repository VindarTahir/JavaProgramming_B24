package day07_unary_operators;

import java.sql.SQLOutput;

public class Store {

    public static void main(String[] args) {

        String storeName = "Target";
        int numberOfTvs = 100;

        System.out.println("Person came into the store and bought a TV");
        System.out.println("Number of TV's now: " + --numberOfTvs);

        System.out.println("Person came into the store and bought a TV");
        System.out.println("Number of TV's now: " + --numberOfTvs);

        System.out.println("Person came into the store and put a TV into the cart");
        System.out.println("Number of TV's in the store is still: " +numberOfTvs--);
        System.out.println("They buy everything and leave " + numberOfTvs);

        System.out.println("Shipment of TV's comes");

        numberOfTvs = numberOfTvs + 53; // reassigned

        System.out.println("Someone with big bucks comes in and buys 5 TV's");
        numberOfTvs = numberOfTvs - 5;


      //  numberOfTvs++ < Same > numberOfTvs = numberOfTvs + 1;



    }



}
