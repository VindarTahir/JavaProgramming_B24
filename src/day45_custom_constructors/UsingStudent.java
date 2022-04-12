package day45_custom_constructors;

public class UsingStudent {

    public static void main(String[] args) {

        Student one = new Student();
        one.grade = 90.5;
        one.batchNumber = 24;
        one.name = "James Bond";

        System.out.println(one.toString()); // We try to call toString
        System.out.println();
        System.out.println(one); // toString is still called

    }
}
