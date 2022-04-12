package day22_loops;

import java.util.Scanner;

public class HelloProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
           Ask for message

           hello -> hi

           bye -> Cya and stops convo

         */

        boolean continueTalking = true;

        while (continueTalking){
            System.out.println("Enter your message");
            String msg = input.nextLine();

            if(msg.equals("hello")){
                System.out.println("Hi");
            } else if (msg.equals("bye")){
                System.out.println("Cya loser");
                continueTalking = false;
            } else {
                System.out.println("??");
                continueTalking = false;
            }
        }


    }
}
