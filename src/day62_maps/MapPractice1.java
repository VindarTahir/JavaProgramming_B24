package day62_maps;

import java.util.HashMap;

public class MapPractice1 {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        //map.add() maps dont have add method because they dont inherit Collection interface

        map.put(1,"Leo");
        map.put(2,"Sydea");
        map.put(3,"Guney");

        System.out.println(map);

        String name = map.get(2); // this is NOT index 2, it is key 2
        System.out.println(name);

        map.put(1, "Fuat");

        System.out.println(map);

    }

}
