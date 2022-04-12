package day04_variables;

public class NumbersExamples {

    public static void main(String[] args) {

        // byte

            byte dateNumber = 31;
        System.out.println(dateNumber);


        // short

        short numberTwo = 200;
        System.out.println(numberTwo);

        // int

        int intNumber; // <- declared an int variable
        intNumber = 1000; // assigned 1000 to my intNumber variable
        System.out.println(intNumber);

        //long

        long numberFour = 4434543;
        System.out.println(numberFour);

        long bigNumber = 3_000_000_000L; /*
                                         Underscore makes the value readable in the code
                                         Compiler reads whole numbers as int by default
                                         put L after number for long to ensure Java reads it as long
                                         */
        System.out.println(bigNumber);

    }




}
