package day37_methods;

import day30_array.ForEachLoop;
import sun.font.FontRunIterator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ConvertNumberToString {

    public static String convertNumberToWord2(int num){

        if (num <= 1 || num > 10){
            return "Out of Range";
        }

        String [] words = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

        return words[num - 1];

    }

    public static void countToOneHundred(){

        // print me numbers starting from 1 -100

        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

    }

    public static void createArray(int [] arr){
        // create an array with numbers 1 through 5, return me the third index
        int n = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 3){
                n = arr[i];
            }
        }
        System.out.println(n);
    }

    public static String convertNumberToWord(int num){

        String result = "";

        switch (num){
            case 1:
                result = "One";
            case 2:
                result = "Two";
            case 3:
                result = "Three";
            case 4:
                result = "Four";
            case 5:
                result = "Five";
            case 6:
                result = "Six";
            case 7:
                result = "Seven";
            case 8:
                result = "Eight";
            case 9:
                result = "Nine";
            case 10:
                result = "Ten";
            default :
                result = "OUT OF RANGE";
        }
        return result;

    }

    public static int method(){
        for (int i = 0; i < 5; i++){

            if (i == 2){
                return 0;
            }

            System.out.println(i);
        }

        return -1;
    }
}
