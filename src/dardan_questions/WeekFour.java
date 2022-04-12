package dardan_questions;

import day53_inheritance.rules.A;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class WeekFour {

    public static ArrayList<String> ahmed(ArrayList<String> arr){

        for (int i = 0; i < arr.size(); i++){

            if (arr.get(i).equalsIgnoreCase("ahmed")){
                arr.remove(arr.get(i));
            }

        }

        for (int i = 0; i < arr.size(); i++){

            if (arr.get(i).equalsIgnoreCase("ahmed")){
                arr.remove(arr.get(i));
            }

        }



        return arr;

    }

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>(Arrays.asList("ahmed","trinidar", "james", "Ahmed", "ahmed"));

        System.out.println(ahmed(arr));

        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,100,101,102));
        System.out.println(removeSomeValues(arr2));

        int a = -641;
        System.out.println(reverseDigit(a));

    }

    public static ArrayList<Integer> removeSomeValues(ArrayList<Integer> arr){

        for (int i = 0; i < arr.size(); i++){

            if (arr.get(i) >= 100){
                arr.remove(i);
            }

        }

        for (int i = 0; i < arr.size(); i++){

            if (arr.get(i) >= 100){
                arr.remove(i);
            }

        }

        return arr;

    }

    public static int reverseDigit(int a){

        String num = a + "";
        String newNum = "";

        for (int i = num.length() - 1; i >= 0; i--){
            newNum += num.charAt(i);
        }

        newNum = newNum.substring(0, newNum.length() - 1);

        int finalNum = Integer.parseInt(newNum);

        if (a < 0){
            finalNum = finalNum * -1;
        }

        return finalNum;

    }


}
