package day19_string;

public class SubstringExam {

    public static void main(String[] args) {


        /*
            Substring allows you to take part of the String based on the given index number

            When you give one number, that is that starting of your substring and it keeps all the characters until the end
         */
                //  01234...
        String s = "javascript";

        System.out.println(s.substring(1));
        System.out.println(s.substring(2));
        System.out.println(s.substring(4));

        System.out.println(s.substring(0, 4));
        System.out.println(s.substring(4));

        System.out.println(s.substring(2, 6));




    }
}
