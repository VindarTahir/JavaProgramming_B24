package day54_abstraction.abstraction;

public class Tesla extends ElectricCar{

    @Override
    public void start() {
        System.out.println("Use Card to start");
    }

    @Override
    public void charge() {
        System.out.println("Plugged in.. charging");
    }
}
