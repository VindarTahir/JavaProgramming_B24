package day20_string;

public class AccountNumber {

    public static void main(String[] args) {

        String accNumber = "6334145";

        /*
            3 ways to check if it starts with 2

            startsWith("2")
            charAt(0) == '2'
            substring(0,1).equals("2")

         */
        if (accNumber.startsWith("2")) {

            if (accNumber.length() == 7) {
                System.out.println("Valid 7 digit account number");

            } else {
                System.out.println("Invalid 7 digit account number");
            }
        } else if (accNumber.startsWith("5")) {

            if (accNumber.length() == 10) {
                System.out.println("Valid 10 digit account number");
            } else {
                System.out.println("Invalid 10 digit account number");
            }

        } else {
            System.out.println("Invalid account number. Needs to start with 2 or 5");
        }


    }
}