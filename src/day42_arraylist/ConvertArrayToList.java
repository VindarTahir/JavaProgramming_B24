package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {

    public static void main(String[] args) {

        Integer [] a = {1, 2, 3};

        Arrays.asList(a); // This allows us to convert from the array to the ArrayList <- not mandatory

        // converting the 'a' array to ArrayList
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(a));
        System.out.println(list);


        // creating an array with values right away
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list2.isEmpty());
        System.out.println(list2);

    }
}
