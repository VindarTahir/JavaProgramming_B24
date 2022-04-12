package day35_methods;

public class OurMathClass {

    /*

        add
        subtract
        multiply
        divide

     */

    public static void addNumbers(double num1, double num2){
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public static void subtractNumbers(double num1, double num2){
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public static void multiplyNumbers(double num1, double num2){
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }

    public static void  divideNumbers(double num1, double num2){
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }

    public static void main(String[] args) {
        divideNumbers(25, 5);
    }

}
