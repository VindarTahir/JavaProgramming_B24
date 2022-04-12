package day38_methods;

public class ArrayAsParameter {

    public static void main(String[] args) {

        int [] arr = {1, 4, 5, 1, 4};
        printArray(arr);

        printArray(1,2,3,4);
        System.out.println();

        String [] str = {"word", "word1", "word2"};

        printArray(str);

        printArray("James", "Bond", "007");
    }

    public static void printArray(int ... arr) {

        for (int each : arr) {
            System.out.println(each);
        }

    }
    public static void printArray(String ... arr){
        for (String each : arr){
            System.out.println(each);
        }
    }

}
