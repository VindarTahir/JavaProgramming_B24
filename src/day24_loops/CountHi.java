package day24_loops;

public class CountHi {

    public static void main(String[] args) {

        String s = "h";

        int hiCounter = 0;

        for (int i = 0; i < s.length(); i++){

            if(s.charAt(i) == 'h' && s.charAt(i + 1) == 'i'){
                hiCounter++;
            }

        }
        System.out.println("There were " + hiCounter + " hi's");
    }
}
