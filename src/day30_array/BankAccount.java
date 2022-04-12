package day30_array;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {

        /*
            String array
            0 - first name
            1 - Acc #
            2 - balance
            3 - acc type

         */

        Scanner input = new Scanner(System.in);

        String [] bankAcc = new String[4];
        System.out.println("Enter your first name");
        bankAcc[0] = input.nextLine();
        System.out.println("Enter your acc number");
        bankAcc[1] = input.nextLine();
        System.out.println("Enter your balance");
        bankAcc[2] = input.nextLine();
        System.out.println("Enter your acc type");
        bankAcc[3] = input.nextLine();

        System.out.println("Your bank info: " + Arrays.toString(bankAcc));



    }
}
