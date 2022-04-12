package day30_array;

public class CountriesLength {

    public static void main(String[] args) {

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia", "Colombia",
                "Honduras", "Indonesia", "United States", "Russia"};

        String smallest = countries[0];
        String biggest = countries[0];

        for (String each : countries) {
            if (each.length() < smallest.length()) {
                smallest = each;

            }
            if (each.length() > biggest.length()) {
                biggest = each;
            }

        }

        System.out.println("Biggest: " + biggest);
        System.out.println("Smallest: " + smallest);

        for (int i = 0; i < countries.length; i++) {

           String each = countries[i];

            if (each.length() < smallest.length()) {
                smallest = each;

            }
            if (each.length() > biggest.length()) {
                biggest = each;
            }

        }

        System.out.println("Biggest: " + biggest);
        System.out.println("Smallest: " + smallest);


    }
}
