package day35_methods;

public class ArrayMethods {

    /*
        Make a method that accepts the array. Find and print the first element

        Make a method that accepts the array. Find and print the middle element

        Make a method that accepts the array. Find and print the last element
     */

    public static void firstElement(int [] nums){
        System.out.println("First element: " + nums[0]);
    }

    public static void middleElement(int [] nums){

        if (nums.length % 2 == 0){
            System.out.println("Middle element: " + nums[nums.length / 2 + 1]);
        } else {
            System.out.println("Middle element: " + nums[nums.length / 2]);
        }

    }

    public static void lastElement(int [] nums){
        System.out.println("Last element: " + nums[nums.length - 1]);
    }

    public static void main(String[] args) {
        int [] num = {1, 2, 3, 4, 5, 6, 7};

        firstElement(num);
        middleElement(num);
        lastElement(num);
    }
}
