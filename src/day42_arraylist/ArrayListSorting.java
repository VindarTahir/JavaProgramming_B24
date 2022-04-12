package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListSorting {

    public static void main(String[] args) {

        // How did you sort Arrays?
        // We used Arrays.sort()

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2,34,42,34,1,7,3,6,1,4));

        Collections.sort(nums);

        System.out.println(nums);

    }
}
