package day55_abstraction.excercise;

public class Squatting extends Lifting {

    @Override
    public void rackWeights() {
        System.out.println("Putting away the weights");
    }

    @Override
    public void perform() {
        System.out.println("Squatting");
    }

    @Override
    public void getCaloriesBurned(int minutes) {
        System.out.println(minutes * 0.35);
    }
}
