package day34_methods;

import java.util.Scanner;

public class Car {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        unlockAndOpenDoor();
        getIntoCarAndCloseDoor();
        putOnSeatBelt();
        checkMirrors();
        startCar();
        drive();
        System.out.println();
        System.out.println("If in a hurry");
        System.out.println();

        driveInHurry();
    }

    public static void unlockAndOpenDoor(){
        System.out.println("Unlock and open the door");
    }

    public static void getIntoCarAndCloseDoor(){
        System.out.println("Get into the car and close door");
    }

    public static void putOnSeatBelt(){
        System.out.println("Put seatbelt on");
    }

    public static void checkMirrors(){
        System.out.println("Checking the left mirror");
        System.out.println("Checking the right mirror");
        System.out.println("Checking the rear view mirror");
    }

    public static void startCar(){
        System.out.println("Putting key in and turning");
    }

    public static void drive(){
        System.out.println("Put the car into drive and press the gas pedal");
    }

    public static void driveInHurry(){
        unlockAndOpenDoor();
        getIntoCarAndCloseDoor();
        startCar();
        drive();
    }
}
