package personal;

public class SpecialCharacter {

    public static void main(String[] args) {

        String str = "!@DGHjnbvg789";
        String special = "";
        String num = "";
        String upper = "";
        String lower = "";

        for(int i = 0; i < str.length(); i++){

            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                num += str.charAt(i) + " ";
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                upper += str.charAt(i) + " ";
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                lower += str.charAt(i) + " ";
            } else {
                special += str.charAt(i);
            }

        }

        System.out.println("Special: " + special);
        System.out.println("Numbers: " + num);
        System.out.println("Upper: " + upper);
        System.out.println("Lower: " + lower);

    }
}
