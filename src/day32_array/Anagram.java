package day32_array;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        /*
            Anagaram

                2 words are anagram if they are built up of the same chars

                abc
                bca
                    -> Anagrams
         */


        char [] word1 = {'a', 'b', 'c'};
        char [] word2 = {'b', 'c', 'a'};

        Arrays.sort(word1);
        Arrays.sort(word2);

        System.out.println(Arrays.toString(word2));

        System.out.println(Arrays.equals(word1, word2));



    }
}
