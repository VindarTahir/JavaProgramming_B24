package day27_nested_loops;

public class MultiplicationTable {

    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++){

            System.out.println("---- Table for " + i + " ----");

            for (int x = 1; x <= 10; x++){
                System.out.println(i + " * " + x + " = " + i * x);
            }
        }

    }
}
