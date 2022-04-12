package day30_array;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOdd {

    /*
        declare an int array
        count how many even numbers
        count how many odd numbers

        print both

        challenges
            traditional for loop
            for each loop

            -not hard code initial array
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] numbers = {9, 24, 5, 1, 5, 29, 52};
        int even = 0;
        int odd = 0;

        String evenNumbers = "";
        String oddNumbers = "";


        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0){
                even++;
                evenNumbers += numbers[i] + " ";
            } else {
                odd++;
                oddNumbers += numbers[i] + " ";
            }


        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        System.out.println("Even2: " + evenNumbers);
        System.out.println("Odd2: " + oddNumbers);


        int even2 = 0;
        int odd2 = 0;


        System.out.println("How many numbers would you like to input?");
        int size = input.nextInt();

        int [] nums = new int[size];


        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter number " + (i + 1));
            nums[i] = input.nextInt();

            if (nums[i] % 2 == 0){
                even2++;
            } else {
                odd2++;
            }

        }

        System.out.println(Arrays.toString(nums));
        System.out.println("Even: " + even2);
        System.out.println("Odd " + odd2);


    }
}
