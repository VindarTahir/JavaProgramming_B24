package personal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlbaQuestionsAgain {


    public static int [] ascendArr(int [] arr) {

        int a=0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {//i>i+1, cause j=i+1
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }

        return arr;

    }

    public static int [] descendArr(int [] arr) {

        int a=0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {//i>i+1, cause j=i+1
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }

        return arr;

    }


    public static void main(String[] args) {

        int [] arr = {1,0,2,0,1,3,0,5};
        Integer [] arr2 = {1,0,1,1,0,1,0,2,2,2,2,2,2};

        String [] arr3 = {"a","b","c"};


        System.out.println(zeroToEnd(arr2));

        System.out.println(Arrays.toString(ascendArr(arr)));
        System.out.println(Arrays.toString(descendArr(arr)));

        System.out.println(Arrays.toString(sumToZero(8)));


    }

    public static ArrayList<Integer> zeroToEnd(Integer [] arr){

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        for (int j = 0; j < list.size(); j++){

            if (list.get(j) == 0){
                list.remove(j);
                list.add(0);
            }

        }

        System.out.println(list);

        return list;

    }


    public static int [] sumToZero(int n){

        int [] arr = new int[n]; // Create new Array based on int n size

        int sum = 0;    // Create container for our sum

        for (int i = 1; i < n - 1; i++){ // Create for loop that is less than n; we state arr[i] is equal to i; We add i to our sum

            arr[i] = i;
            sum += i;

        }
        // After our for loop is done, we have added all of the numbers up to N, ex: N = 8 -> 8 + 7 + 6 + 5 + 4...

        arr[n - 1] = -sum; // Now that our array is full of numbers, we turn sum into negative, which is equal to the last array index

        return arr;

    }

//    public static String combinations(int [] arr){
//
//        for (int i = 0; i < arr.length; i++) {
//
//
//
//        }
//
//    }

}

