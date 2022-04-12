package day07_unary_operators;

public class IncrementAndDecrement {

    public static void main(String[] args) {

        int n =0;
        n++;

        System.out.println(n); // 1

        System.out.println(++n); // 2

        System.out.println(n++); // prints 2

        System.out.println(n); // prints 3 because the post increment is added to the final value


        int age = 10;
        System.out.println(age);
        System.out.println(age++);
        System.out.println(age);
        System.out.println(++age);
        System.out.println(age);

        System.out.println(age++ * 2); // age = 12 * 2
        System.out.println(age); // age = 13

        System.out.println(++age + 2); // 14 + 2
        System.out.println(age);

    }

}
