package personal;

import java.util.Scanner;

public class AgeGroup {

    public static void main(String[] args) {

        /*
            Write a program that can define the age groups of someone based on their given age:

infant (< 1 year)
Toddler (3 - 5)
Kid (6 - 9
Pre-Teen (10 - 12)
Teenager (13 - 17)
Young Adult (18 - 20)
Adult (21 - 35)
Middle-Aged Adult (36 - 55)
Senior Citizen (55+)

Challenge: if age > 120 or less than 0 ==> invalid entry

         */
        int age;
        String result = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        result = "";
        age = input.nextInt();

        if (age < 1 && age >= 0) {
            result = "You're an infant";
        } else if (age >= 3 && age <= 5) {
            result = "You're a toddler";
        } else if (age >= 6 && age <= 9) {
            result = "You're a kid";
        } else if (age >= 10 && age <= 12) {
            result = "You're a pre teen";
        } else if (age >= 13 && age <= 17) {
            result = "You're a teenager";
        } else if (age >= 18 && age <= 20) {
            result = " You're a young adult";
        } else if (age >= 21 && age <= 35) {
            result = "You're an adult";
        } else if (age >= 36 && age <= 55) {
            result = "You're a middle-aged adult";
        } else if (age >= 55 && age <= 120) {
            result = "You're a senior citizen";
        } else {
            result = "Invalid entry";
        }

        System.out.println(result);
    }
}
