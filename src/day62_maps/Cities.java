package day62_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Cities {

    public static void main(String[] args) {

        ArrayList<String> usa = new ArrayList<>(Arrays.asList("Chicago", "New York", "Virginia"));
        ArrayList<String> europe = new ArrayList<>(Arrays.asList("Paris", "Rome", "Sivas", "Berlin"));
        ArrayList<String> asia = new ArrayList<>(Arrays.asList("Bangkok", "Tokyo", "Seoul"));

        Map<String, ArrayList<String>> countries = new HashMap<>();
        countries.put("North America",usa);
        countries.put("Europe", europe);
        countries.put("Asia", asia);
        System.out.println(countries);



        for (String continent : countries.keySet()){    // first loop goes through the keys which are continents

            System.out.println("Cities in " + continent + " are: " + countries.get(continent));

        }

        System.out.println();
        // print first letter of each city

        for (String continent : countries.keySet()){    // second loop goes through the cities which are each ArrayList value
            System.out.println("Cities in " + continent);

            for (String city : countries.get(continent)){
                System.out.println(city.substring(0,1));
            }

        }

    }

}
