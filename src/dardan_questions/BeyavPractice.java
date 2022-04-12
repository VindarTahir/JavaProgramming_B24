package dardan_questions;

public class BeyavPractice {

    // Return me a method that tell me if a number is even or odd

    public static void main(String[] args) {

        int a = 4;
        int b = 7;

        if (a % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        if (b % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        System.out.println(isOddOrEven(167));

        String str = "apples";
        String str2 = "java";
        String str3 = "appplessss";

        String str1 = str.substring(0,1).toUpperCase() + str.substring(1);
        System.out.println(str1);

        System.out.println(longestWord(str, str2, str3));

        int [] arr = {1,2,3,4,5};

        System.out.println(returnIndexArray(arr, 1));

    }

    public static String isOddOrEven(int n){

        if (n % 2 == 0){
            return "Even";
        } else {
            return "Odd";
        }

    }

    /*
    Given three String variables of some text find and print the longest word that also
contains 'a'

    Ex:
        "java"
        "mouse"
        "computer"
        Output: java
    Ex:
        "java"
        "mouse"
        "apples"
        Output: apples

Challenge: Instead of just checking for 'a' add another variable that can be used to
check for any character.

     */

    public static String longestWord(String a, String b, String c){

        int a1 = 0;
        int b1 = 0;
        int c1 = 0;
        String finalStr = "";

        if (a.contains("a")){
            a1 = a.length();
        }
        if (b.contains("a")){
            b1 = b.length();
        }
        if (c.contains("a")){
            c1 = c.length();
        }
        if (a1 > b1 && a1 > c1){
            finalStr = a;
        } else if (b1 > a1 && b1 > c1){
            finalStr = b;
        } else if (c1 > b1 && c1 > a1){
            finalStr = c;
        }
        return finalStr;
    }

    public static int returnIndexArray(int [] arr, int indexNum){

            for (int i = 0; i < arr.length; i++){

                if (i == indexNum){
                    return arr[i];
                }

            }

            return 0;

    }

}
