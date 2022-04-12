package day28_nested_loops;

public class ReverseSecond {

    public static void main(String[] args) {

        String s = "I love java";
        String fixedStr = "";

            for (int i = 0; i < s.length(); i++){

                if (s.charAt(i) == ' '){

                    String reverse = "";                    // Helps store all the characters backwards

                   for (int j = s.lastIndexOf(' '); j >= i; j--){

                       reverse += s.charAt(j);

                   }

                   fixedStr += reverse;
                   i = s.lastIndexOf(' ');

                } else {
                    fixedStr += s.charAt(i);
                }
            }

        System.out.println(fixedStr);
    }
}
