package day29_array;

public class SumOfNumbers {

    public static void main(String[] args) {

        int[] numbers = {4, 1, 4};

        int sum = 0;

        sum += numbers[0];
        sum += numbers[1];
        sum += numbers[2];

        System.out.println(sum);

        // sum with loop

        int[] number2 = {5, 5, 2, 5, 1};

        int sum2 = 0;

        for (int i = 0; i < number2.length; i++) {

            sum2 += number2[i];
        }
        System.out.println(sum2);
    }
}
