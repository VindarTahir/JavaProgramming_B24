package day49_encapsulation;

public class UseCar {

    public static void main(String[] args) {

        Car car = new Car("John", "A0034D2SDF3", 27);
        System.out.println(car.driver);
        System.out.println(car.driver.name);
        System.out.println(car.driver.age);
        System.out.println(car.driver.license);

        Car car2 = new Car("James", "C34404DDDF", 43);
        System.out.println(car2.driver);

    }
}
