package day15_switch;

public class IfWithoutBrackets {

    public static void main(String[] args) {

        if (4 > 6)
            System.out.println("A"); // only prints A because if with no brackets prints next line
        System.out.println("B");    // Does not belong to any if statement

        if (4 == 4)
            System.out.println("C");
        else
            System.out.println("D");
    }
}
