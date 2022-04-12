package day20_string;

public class UserAndPass {

    public static void main(String[] args) {

        String user = "Vinny1256";

        String pass = "Vinny1256";

        if (pass.length() >= 5 && !pass.contains(user)){

            System.out.println("Valid password");

        } else {
            System.out.println("Invalid password");

            if(pass.length() < 5) {

                System.out.println("Your password is less than 5 characters");
            }

            if(pass.contains(user)){

                System.out.println("Password cannot contain username");
            }

        }
    }
}
