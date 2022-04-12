package day12_if_statements;

public class CheckTime {

    public static void main(String[] args) {

        // 24 hour format

        int hour = 12;

        // 11 and before is good morning
        if (hour < 12 && hour >= 6){

            System.out.println("Good morning");

        }

        // hour is between 12 - 15 afternoon+ -> 3pm is 15
        if (hour >= 12 && hour <= 15) {

            System.out.println("Good afternoon");
        }
        // 15+ is evening
        if (hour > 15 && hour < 22){

            System.out.println("Good evening");
        }
        if ((hour >= 22 && hour <=24) || (hour > 0 && hour < 6) )

            System.out.println("Good night");

    }


}
