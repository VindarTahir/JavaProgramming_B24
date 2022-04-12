package personal;

import java.util.Arrays;
import java.util.Locale;

public class Bs {

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
                if (count == 1) {
                    unique += str.charAt(i);
                }

            }

        }
        return unique;
    }


    /*
        So im gonna take the str and see if its less 3

        If its less than 3, return short

        if its more than 3, return the last 3 characters
     */

    public static String frequencyOfChar(String str){

        str = str + " ";
        int count = 0;
        String chars = "";

        for (int i = 0; i < str.length() - 1; i++){
            count++;

            if(str.charAt(i) != str.charAt(i + 1)){

                chars += "" + str.charAt(i)+count;
                count = 0;

            }

        }

        return chars;

    }


    public static boolean isSame(String str, String str2){

        char [] arr = str.toCharArray();
        char [] arr2 = str2.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr2);

        if (Arrays.equals(arr, arr2)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(getUnique("java"));
    }

}


