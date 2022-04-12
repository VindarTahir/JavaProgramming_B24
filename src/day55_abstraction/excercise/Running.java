package day55_abstraction.excercise;

public class Running extends Exercise{

    @Override
    public void perform(){
        System.out.println("Running...");
    }

    @Override
    public void getCaloriesBurned(int minutes){
        System.out.println(minutes * 0.4);
    }

}
