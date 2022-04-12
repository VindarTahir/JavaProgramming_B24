package day19_string;

public class MergeChar {
    public static void main(String[] args) {
        /*

            String one : abc
            String two : def

                merge to get: adbecf


         */

        String one = "abc";
        String two = "def";

        String merge = "";
        merge += one.charAt(0);
        merge += two.charAt(0);

        merge += one.charAt(1);
        merge += two.charAt(1);

        merge += one.charAt(2);
        merge += two.charAt(2);

        System.out.println(merge);


    }
}
