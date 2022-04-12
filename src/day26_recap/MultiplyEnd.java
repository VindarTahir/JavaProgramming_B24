package day26_recap;

import java.util.Scanner;

public class MultiplyEnd {

    /*
        Multiply End [String, Loops]

Given a String and a number return a String that has the ending character duplicated and attached by the number amount of times

	Ex:
		Input:
			Hello?
			3
		Output:
			Hello????

	Ex:
		Input:
			java
			5
		Output:
			javaaaaaa
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a message");
        String msg = input.nextLine();
        System.out.println("Enter how many times you want to repeat the end");
        int num = input.nextInt();

        for (int i = 0; i < num; i++){
            msg += msg.charAt(msg.length() - 1);
        }
        System.out.println(msg);
    }
}
