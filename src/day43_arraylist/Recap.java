package day43_arraylist;

import javax.xml.stream.events.Characters;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Recap {

    public static void main(String[] args) {

        /*
            The first ArrayList is made to be empty
            then we added 3 elements using the add method 3 times
         */

        ArrayList<String> first = new ArrayList<>();

        first.add("water");
        first.add("items");
        first.add("run");

        // The second ArrayList object was made while copying the elements from the first ArrayList

        ArrayList<String> second = new ArrayList<>( first ); // able to make ArrayList object by giving a collection type in the parenthesis
        second.add("pen");

        System.out.println(first + "\n" + second);

        ArrayList<String> third = new ArrayList<>(Arrays.asList("One", "Two"));
        System.out.println(third);

        System.out.println(uniqChars("java"));

    }

    public static ArrayList<Character> uniqChars(String str){

        String uniqChars = "";

        char [] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++){

            int count = 0;

            for (int j = 0; j < arr.length; j++){

                if (arr[i] == arr[j]){

                    count++;

                }
            }

            if (count == 1){
                uniqChars += arr[i];
            }


        }

        char [] arr2 = uniqChars.toCharArray();

        ArrayList<Character> finalResult = new ArrayList(Arrays.asList(arr2));

        return finalResult;


    }
}
