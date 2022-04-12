package saim_questions;

import java.util.ArrayList;

public class Store {

    public static void main(String[] args) {

        // All possible references of a Tshirt object

        Tshirt shirt1 = new Tshirt();
        shirt1.wear();

        Clothes shirt2 = new Tshirt();
        shirt2.wear();

        Object shirt3 = new Tshirt();
        // shirt3.wear(); invalid because Object class does not have wear method

//        HasHood shirt4 = new Tshirt(); not valid because Tshirt class does not implement the HasHood interface

        buy(shirt1);
        buy(shirt2);

        // All possible references of Jacket objects

        Jacket jacket1 = new Jacket();
        jacket1.wear();
        jacket1.putOnHood();


        Clothes jacket2 = new Jacket();
        jacket2.wear();
        ((Jacket)jacket2).putOnHood();

        Jacket jacket2_5 = (Jacket)jacket2;
        jacket2_5.putOnHood();

        HasHood jacket3 = new Jacket();
        ((Clothes)jacket3).wear();
        jacket3.putOnHood();

        buy(jacket1);
        buy(jacket2);
        buy((Jacket)jacket3);
        System.out.println();

        ArrayList<Clothes> list = new ArrayList<>();
        list.add(shirt1);
        list.add(shirt2);
        list.add((Clothes)shirt3);
        list.add(jacket1);
        list.add(jacket2);

        for (Clothes each : list){
            each.wear();
        }

    }

    public static void buy(Clothes item){
    }

}
