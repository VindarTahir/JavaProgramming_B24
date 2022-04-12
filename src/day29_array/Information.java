package day29_array;

import java.util.Arrays;
import java.util.Scanner;

public class Information {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /*

            Student array

            id -> 0
            first name -> 1
            last name -> 2
            batch number -> 3

         */

        String [] student1 = {"324334", "Vindar", "Tahir", "Batch 24"};

        String [] student2 = new String[4];

        student2[0] = "002";                    // Reassigning the array
        student2[1] = "Redir";
        student2[2] = "Taha";
        student2[3] = "Batch 24";

        System.out.println(Arrays.toString(student1));
        System.out.println(Arrays.toString(student2));

        String [] student3 = new String[4];
        System.out.println("Enter your id");
        student3[0] = input.next();
        System.out.println("Enter your first name");
        student3[1] = input.next();
        System.out.println("Enter your last name");
        student3[2] = input.next();
        System.out.println("Enter your batch number");
        student3[3] = input.next();

        System.out.println(Arrays.toString(student3));

        System.out.println("Please enter from the following:\n1)Id #\n2) First Name\n3) Last Name\n4) Batch Number");
        int selection = input.nextInt();

    }
}
