package my_utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringUtil {

    /*
        Reverse method

        It will accept the String parameter and return the reverse version of the String

     */

    public static String reverse(String original) {
        String reverse = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        return reverse;
    }

    /*
        Method that will accept the String and return String in proper format

        First char as uppercase and rest as lowercase

     */

    public static String properFormat(String str) {

        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();

    }

    public static String countLetters(String str){

        // How do we convert String to ArrayList

            /*

            We start with String str = AABCDD
            String [] arr = str.split(""); -> ["A", "A", "B", "C", "D", "D"] as String array

            Array.asList() -> this method accepts the arrays and converts those arrays to an ArrayList

            Arrays.asList(arr) -> ["A", "A", "B", "C", "D", "D"] as an ArrayList

            new ArrayList() -> when we put a collection type inside of the parenthesis it makes the ArrayList with those values

         */

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        String result = "";

        for (String each : list){

            if (!result.contains(each)){

                int count = Collections.frequency(list, each);

                result += each + count;
            }


        }
        return result;
    }

    public static int frequencyOfChar(String word, char letter) {
        int counter = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                counter++;
            }
        }
        return counter;


    }

    public static String getDuplicateCharacters(String str){

        String allDuplicate = "";

        for (int i = 0; i < str.length(); i++){

            if(!allDuplicate.contains("" + str.charAt(i))){

                int count = frequencyOfChar(str, str.charAt(i));

                if (count > 1){
                    allDuplicate += str.charAt(i);
                }
            }

        }

        return allDuplicate;
    }

}
