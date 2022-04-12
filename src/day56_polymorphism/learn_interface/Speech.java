package day56_polymorphism.learn_interface;

public class Speech implements CanTalk{

    @Override
    public void speak() {
        System.out.println("speaking");
    }

}

class Runner {
    public static void main(String[] args) {

        Speech obj = new Speech();

        obj.speak();
        obj.whisper();
        //obj.yell(); not inherited
        CanTalk.yell();

    }
}
