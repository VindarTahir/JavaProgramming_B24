package dardan_questions;

import java.net.Inet4Address;

public class WeekThree {

    /*
        Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replacée by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.

     */

    public static void ConsecutiveNumbers(int n){

        for (int i = 1; i <= n; i++){
            boolean isDivisibleBy2 = i % 2 == 0;
            boolean isDivisibleBy3 = i % 3 == 0;
            boolean isDivisibleBy5 = i % 5 == 0;
            String container = i + "";

            if (isDivisibleBy2 || isDivisibleBy3 || isDivisibleBy5){
                container = "";
            }
            if (isDivisibleBy2){
                container += "Codility";
            }
            if (isDivisibleBy3){
                container += "Test";
            }
            if (isDivisibleBy5){
                container += "Coders";
            }

            System.out.println(container);
        }

    }

    public static boolean primeNumber(int n){

        int count = 0;

        for (int i = 1; i <= n; i++){

            if (n % i == 0){
                count++;
            }

        }

        if (count == 2){
            return true;
        }

        return false;

    }

    //  Armstrong number is a number that is equal to the sum of cubes of the digits.

    // 153 = 1^ 3 + 5^ 3 + 3^ 3
    public static boolean ArmStrongNumber(int n){

        String digits = n + "";

        String [] arr = digits.split("");
        int sumOfDigits = 0;

        for (int i = 0; i < arr.length; i++) {

            sumOfDigits += Math.pow(Integer.parseInt(arr[i]), arr.length);

        }

        if (sumOfDigits == n){
            return true;
        }

        return false;

    }

    public static void main(String[] args) {

        ConsecutiveNumbers(30);

        System.out.println();

        System.out.println(primeNumber(3));

        System.out.println();

        System.out.println(ArmStrongNumber(1633));

    }

}
