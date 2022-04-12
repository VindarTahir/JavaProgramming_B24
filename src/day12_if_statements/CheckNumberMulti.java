package day12_if_statements;

public class CheckNumberMulti {
    public static void main(String[] args) {

        int num1 = 4;
        int num2 = 8;
        int num3 = 1;

        if (num1 > num2 && num1 > num3 ){

            System.out.println("The greatest number is " + num1);

        }
        else if (num2 > num1 && num2 > num3) {

            System.out.println("The greatest number is " + num2);

        }
        else if (num3 > num1 && num3 > num2) {

            System.out.println("The greatest number is " + num3);

        }


    }
}
