package day39_wrapper_arraylist;

import java.util.ArrayList;

public class AddToArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        // adding / assigning a value to array: arr[index] = value

        numbers.add(50); // add will put the element to the end

        // print arrays: Arrays.toString(arr)

        System.out.println(numbers);

        numbers.add(-100);
        numbers.add(200);

        System.out.println(numbers.add(400)); // add method also returns boolean

        System.out.println(numbers);

        // find the length of the array: arr.length

        System.out.println(numbers.size());

        // reading first element from array : arr[0]

        System.out.println("First element " + numbers.get(0));
        System.out.println("Last element " + numbers.get(numbers.size() - 1));


    }
}
