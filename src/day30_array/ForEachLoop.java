package day30_array;

public class ForEachLoop {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5,};

        for (int i = 0; i < nums.length; i++) {

            System.out.println("number " + nums[i]);

        }

        System.out.println();

        for(int eachNumber : nums){

            System.out.println("number " + eachNumber); // eachNumber = nums[i]

        }

        String [] str = {"java", "selenium", "db", "api"};

        for (int i = 0; i < str.length; i++) {

            System.out.println(str[i]);

        }

        for(String word : str){
            System.out.println(word);
        }
    }
}
