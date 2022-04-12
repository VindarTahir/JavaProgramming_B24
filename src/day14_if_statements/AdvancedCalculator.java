package day14_if_statements;

import java.util.Scanner;

public class AdvancedCalculator {

    public static void main(String[] args) {

        /*
            Ask the user to enter 2 numbers

            operator - String
            @

            / -> 2nd num = 0

            */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        double num1 = input.nextDouble();

        System.out.println("Enter another number");
        double num2 = input.nextDouble();

        System.out.println("Enter the operator\n\t+, - * / % ");
        String operator = input.next();

        boolean isValidOperator = operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("%");

        double result = 0;

        if (isValidOperator) {

            if (operator.equals("+")) {

                result = num1 + num2;
            } else if (operator.equals("-")) {
                result = num1 - num2;
            } else if (operator.equals("*")) {
                result = num1 * num2;
            } else if (operator.equals("/")) {
                result = num1 / num2;
            } else if (operator.equals("%")) {
                result = num1 % num2;
            }


        } else {

            System.out.println(operator + " is not a valid operator");

        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
