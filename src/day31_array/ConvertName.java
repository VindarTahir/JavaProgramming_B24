package day31_array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ConvertName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.next();

        char [] newFirst = firstName.toCharArray();

        System.out.println("Enter your last name");
        String lastName = input.next();

        char [] newLast = lastName.toCharArray();

        System.out.println("First name: " + Arrays.toString(newFirst) + "\nLast Name: " + Arrays.toString(newLast));

        System.out.println(firstName.toCharArray()[0]);
        System.out.println(newFirst[0]);



    }

}
