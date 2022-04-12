package day52_inheritance.lyft;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Drive {

    public static void main(String[] args) {

        Lyft lyft = new Lyft();
        System.out.println(lyft.calculateRate(5));

        LyftXL lyftXl = new LyftXL();
        System.out.println(lyftXl.calculateRate(5));

        Lux lux = new Lux();
        System.out.println(lux.calculateRate(5));




    }

}
