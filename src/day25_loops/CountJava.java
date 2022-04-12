package day25_loops;

import com.sun.org.apache.bcel.internal.generic.FSUB;

public class CountJava {

    public static void main(String[] args) {

        String s = "java is a language. Java can be used for a lot java";

        int java = 0;

        for (int i =0; i < s.length() - 4; i++){

           // System.out.println(s.substring(i, i + 4));

            if(s.substring(i, i + 4).equals("java")){
                java++;
            }

        }

        /*
            java is a language

            java    0, 4    i, i + 4
            ava     1, 5    i, i + 4
            va i    2, 6    i, i + 4
            ...
         */
    }
}
