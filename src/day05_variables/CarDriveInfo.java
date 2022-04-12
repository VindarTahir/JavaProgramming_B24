package day05_variables;

public class CarDriveInfo {

    public static void main(String[] args) {

        /*
        carModel    -> StringdriverName  -> StringlicenseNum  -> Stringspeed       -> shortisAutomatic -> booleanlicenseClass-> char==

         */
        String carModel = "Honda Accord";
        String driverName = "Vinny";
        String licenseNum = "A000-017-2321";
        short speed = 25;
        boolean isAutomatic = true;
        char licenseClass = 'D';

        System.out.println("Car model: " + carModel);
        System.out.println("Driver Name: " + driverName);
        System.out.println("License Number: " + licenseNum);
        System.out.println("Speed Travelling: " + speed);
        System.out.println("Automatic?: " + isAutomatic);
        System.out.println("License Class: " + licenseClass);


    }



}
