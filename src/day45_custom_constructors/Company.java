package day45_custom_constructors;

import java.util.Arrays;

public class Company {
    public static void main(String[] args) {

        Employee one = new Employee("James Bond", 213412, "Agent", 1_000_000);

        System.out.println(one);
        one.goToMeeting();
        System.out.println();

        Employee [] staff = new Employee[3];
        staff[0] = one;
        staff[1] = new Employee("Nadir", 12131, "SDET", 300_000);

        System.out.println(Arrays.toString(staff));
    }
}
