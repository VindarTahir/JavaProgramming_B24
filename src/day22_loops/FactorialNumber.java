package day22_loops;

public class FactorialNumber {

    public static void main(String[] args) {

        int num = 10;
        int total = 1;

        while(num > 1){
            System.out.print(total + " * " + num + " \n");
            total *= num; // total = total * number
            num--;
        }

        /*
            starting
            num: 5
            total: 1

            iteration: 1
            num: 4
            total: 5

            iteration: 2
            num: 4
            total: 5 * 4 = 20

            iteration: 3
            num: 3
            total: 20 * 3 = 60

            iteration: 4
            num: 2
            total: 60 * 2 = 120

            iteration: 5
            num: 1
            total: 120 * 1 = 120
         */

        System.out.println("\nTotal: " + total);
    }
}
