package day16_switch;

import java.util.Scanner;

public class DayInWeek {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number 1-7");
        int days = input.nextInt();
        String msg = "";

        switch (days){

            case 1:
                msg = "Monday";
                break;
            case 2:
                msg = "Tuesday";
                break;
            case 3:
                msg = "Wednesday";
                break;
            case 4:
                msg = "Thursday";
                break;
            case 5:
                msg = "Friday";
                break;
            case 6:
                msg = "Saturday";
                break;
            case 7:
                msg = "Sunday";
                break;

            default:
                msg = "Invalid Entry";
                break;

        }
        System.out.println(days);
        System.out.println(msg);
    }
}
