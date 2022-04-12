package day43_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfExample {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2,5,2,5,3,4,7,4,5,6,6));

        System.out.println(nums);

        nums.removeIf( n -> n % 2 != 0 );

        System.out.println(nums);


    }
}
