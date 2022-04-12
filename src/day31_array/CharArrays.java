package day31_array;

import java.util.Arrays;

public class CharArrays {

    public static void main(String[] args) {

        char [] letters = {'j', 'a', 'v', 'a'};

        String s = "java is fun";

        s.toCharArray();

        char [] java = s.toCharArray();

        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(java));
    }
}
