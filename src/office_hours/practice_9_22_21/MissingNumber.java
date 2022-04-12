package office_hours.practice_9_22_21;

import java.util.Arrays;

public class MissingNumber {

    /*
    get an array of numbers from 1 to 9

        [1, 2, 4, 5, 6, 7, 8, 9 ]

        find the missing number

        -> 3
     */

    public static int findMissingNum(int ... nums){

        Arrays.sort(nums);
        int checking = nums[0];

        for (int each : nums){

            if (checking != each){
                break;
            }
            checking++; // updates the checking number every iteration
        }
        return checking;
    }

    public static void main(String[] args) {

        System.out.println(findMissingNum(5,4,6,9,1,2,3,8));
    }
}
