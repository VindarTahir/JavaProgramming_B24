package day52_inheritance.computer;

import com.sun.xml.internal.bind.v2.TODO;

public class Lab {

    public static void main(String[] args) {

        Windows computer1 = new Windows(16);

        System.out.println(computer1.os);
        System.out.println(computer1.memory);

        Windows computer2 = new Windows(32);

        System.out.println(computer2.os);
        System.out.println(computer2.memory);

        Mac computer3 = new Mac(64);

        Mac computer4 = new Mac(128);

        System.out.println(computer4);

    }
}
