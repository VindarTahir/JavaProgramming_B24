package day62_maps;

import java.util.HashMap;

public class LoopingMap {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println(map.keySet());
        System.out.println();

        for(String key : map.keySet()){

            System.out.println("The key is: " + key);
            System.out.println("The value is: " + map.get(key));
            System.out.println();

        }

        // We iterate through the set of keys, and using the keys, we are able to access the value with get method

        System.out.println(map.values());

    }

}
