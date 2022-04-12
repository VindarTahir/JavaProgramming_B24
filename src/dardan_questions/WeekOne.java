package dardan_questions;

import java.util.Arrays;

public class WeekOne {

    public static String[] concatArr(String[] arr, String[] arr2) {

        String [] arr3 = new String[arr.length + arr2.length];
        int num = 0;

        for (int i = 0; i < arr.length; i++) {

            arr3[num] = arr[i];
            num++;

        }

        for (int j = 0; j < arr2.length; j++) {

            arr3[num] = arr2[j];
            num++;

        }
        return arr3;
    }

    public static String isOddOrEven(int n) {

        if (n % 2 != 0) {
            return "Odd";
        } else {
            return "Even";
        }

    }

    public static int divide(int a, int b) {

        int count = 0; // counter

        int x = 0; // variable

        if (a > b) {

            while (x < a){
                x += b;
                count++;
            }
        }

        if (a < b) {

            while (x < b){
                x += a;
                count++;
            }
        }

            return count;
    }

    public static void main(String[] args) {

        String[] arr = {"Java", "Is", "Very", "Fun,"};
        String[] arr2 = {"HTML", "Is", "Also", "Fun"};

        System.out.println(Arrays.toString(concatArr(arr, arr2)));

        System.out.println(isOddOrEven(12));
        System.out.println(isOddOrEven(13));

        System.out.println(divide(35, 5));
        System.out.println(divide(9, 72));


    }

    public static boolean isSame(String a, String b){

        if (a.contains(b)){
            return true;
        } else {

            return false;

        }


    }


}
