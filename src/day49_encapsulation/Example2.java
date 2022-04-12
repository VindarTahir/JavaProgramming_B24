package day49_encapsulation;

import java.util.Arrays;

import static java.lang.Math.*;

import static java.util.Arrays.*;

public class Example2 {

    public static void main(String[] args) {

        int [] arr = {3, 4, 1, 5, 1};

        sort(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println(PI); // Importing Math allows us to do PI instead of Math.PI

        System.out.println(cos(4.8));

    }
}
