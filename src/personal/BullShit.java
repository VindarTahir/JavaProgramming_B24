package personal;

import java.util.Collections;
import java.util.Scanner;

public class BullShit {

    public static String getUnique(String str) {

        /*
            Write a return  method that can find the unique characters from the String
            Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

         */

        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                unique += str.charAt(i);
            }
        }
        return unique;
    }

    public static void main(String[] args) {
        System.out.println(reverse("java"));
    }

    public static String reverse(String str){

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--){

            reverse += str.charAt(i);

        }

        return reverse;
    }
}

