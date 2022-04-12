package day28_nested_loops;

public class PrimeNumber {

    // given a number, determine if its a prime number

    /*
        7 / 2
        7 / 3
        7 / 4
        7 / 5
        7 / 6

     */

    public static void main(String[] args) {

        int number = 7;
        boolean isPrime = true;

            for (int i = 2; i < number; i++){

                if (number % i == 0){
                    isPrime = false;
                    break;
                }

            }

        System.out.println("Is your number prime: " + isPrime);
    }
}
