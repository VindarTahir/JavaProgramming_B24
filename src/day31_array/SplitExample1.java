package day31_array;

import java.util.Arrays;

public class SplitExample1 {

    public static void main(String[] args) {

        String s = "monday,tuesday,wednesday";

        // Split up a String into a String array

        String [] days = s.split(",");

        System.out.println(Arrays.toString(days));

        String s2 = "Jan-Feb-Mar-Apr-May";

        String [] months = s2.split("-");

        System.out.println(Arrays.toString(months));


    }



}