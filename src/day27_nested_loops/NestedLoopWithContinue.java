package day27_nested_loops;

public class NestedLoopWithContinue {

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++){

            System.out.println("First " + "i: " + i);

            for (int j = 1; j <= 2; j++){

                if (j == 2){
                    continue;
                }
                System.out.println("Second " + "i: " + i + " j:" + j);
            }
        }
    }
}
