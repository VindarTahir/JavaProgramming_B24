package day38_methods;

import java.util.Arrays;

public class CountElements {

     /*
         Create a method that accepts an int array and a number

         count and return the number of time and the given number is found in the array

            return type: int
      */

    public static void main(String[] args) {

        int [] arr = {1, 2, 5, 1, 5, 1, 3};

        System.out.println(countElement(arr, 1));
        System.out.println(countElement(arr, 5));
        System.out.println(countElement(arr, 4));

        getUniqueElements(arr);
    }

    public static int countElement(int [] arr, int num){

        int counter = 0;

        for (int i = 0; i < arr.length; i++){

            if (arr[i] == num){
                counter++;
            }
        }
        return counter;
    }

    /*
        Given an int array, find and print all of the unique elements
     */

    public static void getUniqueElements(int [] nums){

        for (int each : nums){

            int counter = countElement(nums, each);

            if (counter == 1){
                System.out.println(each);
            }

        }

    }

}


