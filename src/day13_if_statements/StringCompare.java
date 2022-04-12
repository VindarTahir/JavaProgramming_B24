package day13_if_statements;

public class StringCompare {

    public static void main(String[] args) {

        String city = "Chicago";
        String message = "";

        if (city.equals("Mclean")) {
            message = "City is in Virginia";
        } else {
            message = "City is not in Virginia";
        }
        if (city.equals("Chicago")) {
            message = "City is in Illinois";
        } else {
            message = "City is not in Illinois";
        }

        System.out.println(message);

        String str = "java";
        String str2 = "javascript";

        if (!str.equals(str2)) { // str == str2
            System.out.println("Strings are not equal");
        } else {
            System.out.println("Strings are equal");
        }
    }


}
