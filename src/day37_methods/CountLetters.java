package day37_methods;

public class CountLetters {

    /*
        String, letter

        how many times is the letter in the String

        Example:
            apple, p
            -> 2

        return type: int
        method name: frequencyOfChar
        Params: String, char

     */
    public static void main(String[] args) {
        System.out.println(frequencyOfChar("Apple", 'p'));
        System.out.println(frequencyOfChar("java", 'a'));
        System.out.println(frequencyOfChar("anagram", 'a'));


    }

    public static int frequencyOfChar(String word, char letter){

        int counter = 0;

        for (int i = 0; i < word.length(); i++){

            if(word.charAt(i) == letter){
                counter++;
            }

        }

        return counter;



    }
}
