package dardan_questions;

import day53_inheritance.rules.A;

import java.util.ArrayList;
import java.util.Arrays;

public class JiraTask {

    public static ArrayList<String> swap(ArrayList<String> list, int a, int b){

        String c = list.get(a);

        list.set(a, list.get(b));

        list.set(b, c);

        return list;

    }

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("one", "two", "three"));

        System.out.println(swap(arr, 0, 2));

    }

}
