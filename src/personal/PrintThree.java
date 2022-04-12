package personal;

import java.util.Scanner;

public class PrintThree {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String word = scan.next();

            String msg = "";

            if(word.length() % 2 != 0 && word.length() > 5){

                msg = word.substring (word.length() / 2 - 1, word.length() / 2 + 2);

            } else {
                msg = "invalid";
            }

            System.out.println(msg);
        }
}