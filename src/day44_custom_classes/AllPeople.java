package day44_custom_classes;

public class AllPeople {

    public static void main(String[] args) {

        // make Person object

        Person personOne = new Person(); // We made a Person object / Made an instance of Person class

        personOne.name = "James Bond";

        // age = 40; there is no local age

        personOne.age = 45;
        personOne.hairColor = "Black";
        personOne.Sex = 'M';
        personOne.isMarried = false;

        // This will not print anything useful, for now
        System.out.println(personOne);

        // How to print each field?
        // A: In order to acess each instance variable, we need to use the reference (object name)
        System.out.println("Name: " + personOne.name);
        System.out.println("Age: " + personOne.age);
        System.out.println("Hair colo: " + personOne.hairColor);
        System.out.println("Sex: " + personOne.Sex);
        System.out.println("Married: " + (personOne.isMarried ? "Yes" : "No "));

        // System.out.println(Person.name); Name cannot be accessed because it is not being used with an object

    }
}
