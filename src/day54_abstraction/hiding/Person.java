package day54_abstraction.hiding;

public class Person {

    String name = "James Bond";

}

class Baby extends Person {

    String name = "Mikeeyyyy";

}

class Runner {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println(person.name);

        Baby baby = new Baby();
        System.out.println(baby.name);

    }
}
