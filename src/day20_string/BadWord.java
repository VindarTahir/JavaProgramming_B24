package day20_string;

import java.util.Scanner;

public class BadWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your message");
        String msg = input.nextLine().toLowerCase();

        boolean hasBadWord = msg.contains("idiot") || msg.contains("dumb") || msg.contains("heck");

        if (hasBadWord) {
            System.out.println("Message not sent");
        } else {
            System.out.println("Message sent");
        }
    }
}
