package day49_encapsulation;

public class Car {

    Driver driver;

    public Car(String name, String license, int age){

        driver = new Driver(name, license, age);

    }

}
// Seperate class in the same file
class Driver{
    String name;
    String license;
    int age;

    public Driver(String name, String license, int age) {
        this.name = name;
        this.license = license;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", license='" + license + '\'' +
                ", age=" + age +
                '}';
    }
}
/*
    String driver; // name, licenseNum, age
    String engine; // Cylinder, horsepower
 */
