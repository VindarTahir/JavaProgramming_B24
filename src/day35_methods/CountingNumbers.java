package day35_methods;

import java.util.Scanner;

public class CountingNumbers {

    /*
        Define a mthod that will count number from 0 to 5
        print the numbers in one line
     */

    public static void numbers0To5(){

        int num = 0;

        while (num <= 5){
            System.out.print(num++ + " ");;
        }

        System.out.println();

    }

    public static void numbers0ToGivenNumber(int n){

        for (int i = 0; i <= n; i++){
            System.out.print(i + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        numbers0To5();
        numbers0ToGivenNumber(10);
    }
}
