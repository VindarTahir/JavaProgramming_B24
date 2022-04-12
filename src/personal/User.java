package personal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter full name");
        String user = input.nextLine();

        if (user.contains("Max Payne") || user.contains("Alan Wake")) {
            System.out.println("User found");
        } else {
            System.out.println(user);
        }

        System.out.println(reverseString("beyavisnotgay"));


    }

    public static String reverseString(String a) {

        String result = "";

        for (int i = a.length() - 1; i >= 0; i--) {

            result += a.charAt(i);

        }

        return result;

    }


}
