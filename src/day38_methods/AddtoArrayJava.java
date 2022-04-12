package day38_methods;

import java.util.Arrays;

public class AddtoArrayJava {

    /*
        W e want to return a new array with the number added to the end of the array

        Input:
            {1,2,3}, 5
            {1,2,3,5}
     */

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};

        System.out.print(Arrays.toString((addElement(arr, 5))));

    }

    public static int [] addElement(int [] arr, int element){

        int [] newArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++){

            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = element;

        return newArr;
    }
}
