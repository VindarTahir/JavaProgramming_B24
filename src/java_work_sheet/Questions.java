package java_work_sheet;

public class Questions {

    public static int populationMax(int [] arr){

        int count2 = arr[0];

        for (int i = 0; i < arr.length; i++){

            int count = 0;

            for (int j = 1; j < arr.length; j++){

                if (arr[i] == arr[j]){
                    count++;
                }

            }

        }

        return count2;

    }

    public static void main(String[] args) {

        int [] arr = {1,1,2,3,2,2,3,};

        System.out.println(populationMax(arr));

    }

}
