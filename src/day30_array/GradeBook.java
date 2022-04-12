package day30_array;

public class GradeBook {

    public static void main(String[] args) {

        /*

            studen array -> names of students
            grade values (double) -> grades of students

            [ james bond, ]
            [     80   ,

         */

        String [] studentNames = {"James Bond", "Jamie Foxx", "Luke Smith"};
        double [] studentGrades = {90, 80.5, 100};

        for (int i = 0; i < studentGrades.length; i++) {

            System.out.println(studentNames[i] + ": Grade: " + studentGrades[i]);

        }
    }
}
