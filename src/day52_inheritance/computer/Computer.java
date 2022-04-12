package day52_inheritance.computer;

public class Computer {

    int memory;
    String os;

    public Computer(int memory, String os) {
        this.memory = memory;
        this.os = os;
    }

    @Override
    public String toString(){
        return "Os: " + os + " Memory: " + memory;
    }
}
