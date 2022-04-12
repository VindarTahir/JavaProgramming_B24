package day16_switch;

import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your month name");

        int days = 0;

        switch (input.next()) {

            case "February":
                days = 28;
                break;
            case "April":
            case "June":
            case "November":
                days = 30;
                break;
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                days = 31;
                break;
            default:
                System.out.println("Invalid entry");
                break;

        }
        if (days != 0) {
            System.out.println(days + " days");
        }
    }
}
