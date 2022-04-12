package day51_inheritance;

public class AudioBook extends Book{

    double duration;
    String narrator;

    public void listen(){
        System.out.println("Listnening to " + title + ", read by " +narrator + " which is " + duration + " mins long");
    }

}

// AudioBook is a book