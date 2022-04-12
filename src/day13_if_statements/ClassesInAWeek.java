package day13_if_statements;

import java.util.Scanner;

public class ClassesInAWeek {

    public static void main(String[] args) {
        /*
            day

            monday, wednesday, thursday, saturday, sunday
                -> java
            tuesday
                -> soft skills

            friday
                -> off day

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day");
        String day = input.next();

        boolean isTechnicalDay = day.equals("Monday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Saturday") || day.equals("Sunday");

        boolean softSkills = day.equals("Tuesday");

        boolean isFriday = day.equals("Friday"); // !isTechnicalDay && !softSkills -> only other option is "Friday"

        if (isTechnicalDay) {
            System.out.println("Java");
        } else if (softSkills) {
            System.out.println("Soft skills");
        } else if (isFriday) {
            System.out.println("Off day");
        } else {
            System.out.println("Not a valid day");
        }
    }

}
