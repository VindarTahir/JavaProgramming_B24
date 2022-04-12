package day32_array;

import java.util.Arrays;

public class SortArrays {

    public static void main(String[] args) {

        int [] nums = {4, 1, 23, -1, 34, 7};

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        System.out.println("Smallest number: " + nums[0]);
        System.out.println("Biggest number: " + nums[nums.length - 1]);

    }
}
