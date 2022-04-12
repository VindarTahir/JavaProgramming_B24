package day16_switch;

import java.awt.*;
import java.util.Scanner;

public class LeaseCar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Which car make do you want");
        String carMake = input.nextLine();

        System.out.println("Which " + carMake + " model do you want?");
        String carModel = input.nextLine();

        double leasePrice = 0;

        switch (carMake) {

            case "Lexus":
                if (carModel.equals("RX350")) {
                    leasePrice = 600;
                } else if (carModel.equals("LC500")) {
                    leasePrice = 400;

                } else if (carModel.equals("CT200H")) {
                    leasePrice = 350;
                } else {
                    System.out.println("We dont have " + carModel);
                }
                break;

            case "Cadillac":
                if (carModel.equals("Escalade")) {
                    leasePrice = 2000;
                } else if (carModel.equals("ATS")) {
                    leasePrice = 1500;

                } else {
                    System.out.println("We dont have " + carModel);
                }
                break;

            default:
                System.out.println("We don't have " + carMake + " " + carModel);
                break;


        }

        if (leasePrice != 0) {
            System.out.println("You can lease a " + carMake + " " + carModel + " for $" + leasePrice);
        }

    }
}
