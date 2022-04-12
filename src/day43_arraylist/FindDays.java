package day43_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDays {

    /*
        Create a method that will return an ArrayList with all the days
        Mon - tues, wed, etc...sunday

        overload the method so it accepts int - which day of the week they want
        String

        input 1
        output monday
     */

    public static ArrayList<String> getDays(){

        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        ArrayList<String> daysInList = new ArrayList<>(Arrays.asList(days));

        return daysInList;

    }

    public static String getDays(int day){

        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        ArrayList<String> daysInList = new ArrayList<>(Arrays.asList(days));

        if (day == 0){
            System.out.println("null");
        }

        return daysInList.get(day - 1);

    }

    public static void main(String[] args) {
        System.out.println(getDays());
        System.out.println(getDays(5));

        ArrayList<String> days = getDays();
        System.out.println( days.containsAll(Arrays.asList("Monday", "Tuesday", "Thursday"))); // checks all elements provided
        System.out.println( days.containsAll(Arrays.asList("Monday", "April", "Thursday")));
    }
}
