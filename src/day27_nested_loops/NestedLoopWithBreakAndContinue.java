package day27_nested_loops;

public class NestedLoopWithBreakAndContinue {

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++){

//            if (i == 2){      This breaks the outer loop, so only one iteration of the outer loop is run
//                break;
//            }

            System.out.println("First");

            for (int j = 1; j <= 2; j++){

//                if (j == 2){     This breaks the inner loop, so only one iteration of the inner loop is run
//                    break;
//                }
                System.out.println("Second");
            }
        }
    }
}
