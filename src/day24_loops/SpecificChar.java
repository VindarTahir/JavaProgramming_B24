package day24_loops;

public class SpecificChar {

    public static void main(String[] args) {


        /*
            how many times a specific char is in the String

         */

        String s = "java has apples";

        int count = 0;


        for (int i = 0; i < s.length(); i++){

            if (s.charAt(i) == 'a'){
                count++;
            }

        }

        System.out.println("\"a\" was found " + count + " times");
    }
}
