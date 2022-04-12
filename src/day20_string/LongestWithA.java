package day20_string;

public class LongestWithA {

    public static void main(String[] args) {

        String word1 = "java";
        String word2 = "computer";
        String word3 = "apples";

        String biggest = "";

        if (word1.contains("a") && word1.length() > biggest.length()){
            biggest = word1;
        }
        if (word2.contains("a") && word2.length() > biggest.length()){
            biggest = word2;
        }
        if (word3.contains("a") && word3.length() > biggest.length()){
            biggest = word3;
        }

       // System.out.println("Biggest: " + biggest);

        System.out.println(biggest.isEmpty() ? "None are valid" : "biggest: " + biggest);

    }
}
