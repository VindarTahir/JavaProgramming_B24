package day43_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkMethods {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(5);

        nums.addAll(Arrays.asList(4,5,3,4,5,5,6));

        ArrayList<Integer> other = new ArrayList(Arrays.asList(10,20));

//        nums.add(other.get(0));
//        nums.add(other.get(1));
        nums.addAll(0, other); // puts all the values of the other ArrayList at index position 0 in nums

        System.out.println(nums);
        System.out.println(other);

//        Integer five = 5;     These 2 lines only removes the first 5
//        nums.remove(five);

        nums.removeAll( Arrays.asList(5,4));  // removes all the 5's and 4's in the ArrayList

        System.out.println(nums);

    }
}
