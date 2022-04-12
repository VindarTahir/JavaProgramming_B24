package day32_array;

import java.util.Arrays;

public class StringSortArray {

    public static void main(String[] args) {

        String [] str = {"java", "8eight", "Hello", "hello", "HELLo", "$dollar", "HELlo"};

        Arrays.sort(str);

        System.out.println(Arrays.toString(str));
    }
}
