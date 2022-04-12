package saim_questions;

public class Jacket extends Clothes implements HasHood{

    @Override
    public void wear() {
        System.out.println("Putting on jacket");
        putOnHood();
    }

    @Override
    public void putOnHood() {

    }
}
