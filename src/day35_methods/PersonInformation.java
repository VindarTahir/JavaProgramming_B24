package day35_methods;

public class PersonInformation {

    /*
        Building up email

        Parameter: name (first and last) && domain

        buildEmail("james bond", "gmail")
        output: james_bond@gmail.com
     */

    public static void buildEmail(String name, String domain){

        String email = name + "@" + domain + ".com";

        email = email.replace(" ", "_");

        System.out.println(email);

        System.out.println();
    }

    public static void login(String user, String password){

        if (user.equals("Vinny") && password.equals("BigBoi123")){
            System.out.println("You are logged in");
        } else {
            System.out.println("Invalid login");
        }
    }

    public static void main(String[] args) {
        login("Vinny", "BigBoi123");
    }
}
