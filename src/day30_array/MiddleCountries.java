package day30_array;

public class MiddleCountries {

    public static void main(String[] args) {

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia", "Colombia",
                "Honduras", "Indonesia", "United States", "Russia"};

        for (String country : countries) {

            int mid = country.length() / 2;


            if (country.length() % 2 == 0) {


                System.out.println(country.substring(mid - 1, mid + 1));
                System.out.println(country.charAt(mid - 1) + "" + country.charAt(mid));


            } else {

                System.out.println(country.charAt(mid));

            }
        }

        // Traditional loop approach

        for (int i = 0; i < countries.length; i++) {

            String country = countries[i];

            int mid = country.length() / 2;


            if (country.length() % 2 == 0) {


                System.out.println(country.substring(mid - 1, mid + 1));
                System.out.println(country.charAt(mid - 1) + "" + country.charAt(mid));


            } else {

                System.out.println(country.charAt(mid));

            }
        }

    }
}
