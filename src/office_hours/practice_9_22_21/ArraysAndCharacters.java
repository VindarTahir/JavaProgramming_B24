package office_hours.practice_9_22_21;

public class ArraysAndCharacters {

    /*

       loop, array, string

       method

       frequency of char
       Array of Strings
       find the frequency or the count of a speific character

       { "apple", "ape", "java" }
       'a'
     */

    public static int frequencyOfChar(String [] words, char letter){

        int count = 0;

        for (String eachWord : words){

            for(char eachLetter : eachWord.toLowerCase().toCharArray()){

                if (eachLetter == letter){
                    count++;
                }
            }

        }

        return count;
    }

    public static void main(String[] args) {

        String [] words = {"apple", "ape", "java"};

        System.out.println(frequencyOfChar(words, 'a'));
    }
}
