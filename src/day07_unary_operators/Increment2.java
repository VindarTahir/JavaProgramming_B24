package day07_unary_operators;

public class Increment2 {

    public static void main(String[] args) {

        int i = 5;
        i++;

        int x = i++; // int x = 6

        System.out.println("X: " + x);
        System.out.println("i: " + i);

        int b = 10;
        int c = b++; // b becomes 11 because pre increment
                     // c becomes 11 because b = 11

        System.out.println("b: " + b);
        System.out.println("c: " + c);

        String s = "Java";



    }

}
