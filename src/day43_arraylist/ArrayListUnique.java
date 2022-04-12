package day43_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListUnique {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,4,1,2,4,4,3,4,5,6));
        System.out.println(getUniqueElements(list));
    }

    /*
        Create a method that accepts an ArrayList and returns an ArrayList of only unique values
     */

    public static ArrayList<Integer> getUniqueElements( ArrayList<Integer> list){

        ArrayList<Integer> unique = new ArrayList<>();

        for (int each : list){

            int count = Collections.frequency(list, each);

            if (count == 1){
                // unique element
                unique.add(each);
            }

        }

        return unique;

    }
}
