package day40_arraylist;

import java.util.ArrayList;

public class RemoveMethod {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Water");
        list.add("Sun");
        list.add("Wind");
        list.add("Wood");
        System.out.println(list);

        list.remove(0); // removes the first element
        System.out.println(list);

        list.remove(list.size() - 1);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        System.out.println();

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(50);
        nums.add(70);
        nums.add(80);

        System.out.println(nums);

        int firstRemoved = nums.remove(1);

        System.out.println("First remove element: " + firstRemoved);
        System.out.println(nums);

        // adding the removed element back into the arraylist

        nums.add(1, firstRemoved);

        System.out.println(nums);

    }
}
