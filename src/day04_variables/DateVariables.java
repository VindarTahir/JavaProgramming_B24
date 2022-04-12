package day04_variables;

public class DateVariables {

    public static void main(String[] args) {

        /*
    Have 3 variables
        number format: month
        day
        year

        output:
            m/d/y

     */
        int month, day, year;    // Declares 3 int variables

        month = 7;
        day = 31;
        year = 21;
        /*
        Above is the same as doing it in 3 lines
        int month;
        int day;
        int year;
         */

        System.out.println("Today's date is: "+ month + "/"+day+"/"+year);



        month = 8;
        day = 23;
        year = 21;
        System.out.println("\nToday's new date is: "+ month + "/"+day+"/"+year);





    }



}
