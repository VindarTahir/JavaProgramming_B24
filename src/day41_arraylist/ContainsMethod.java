package day41_arraylist;

import java.util.ArrayList;

public class ContainsMethod {

    public static void main(String[] args) {

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(100);
        nums2.add(500);
        nums2.add(700);
        nums2.add(900);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(500);
        nums.add(700);
        nums.add(900);
        System.out.println(nums);

        System.out.println(nums.equals(nums2));

        System.out.println(nums.contains(100));

        System.out.println(nums.contains(600));

        nums.remove(0);

    }
}
