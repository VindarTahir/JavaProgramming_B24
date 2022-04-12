package personal;

public class Pizza {

    public static void main(String[] args) {

        /*
        -----------------------------------------------------------

add new class Pizza
add main method

	pizza = "cheese"
	pizza slices = 8
	people = 4
	calculate the slices per person

Example output:

	We ordered cheese pizza with 8 slices, 4 people ate 2 slices each

-----------------------------------------------------------
         */

        String pizza = "cheese";
        int slices = 8;
        int people = 4;
        int slicesPerPerson = slices / people;

        System.out.println("We ordered a " + pizza + " pizza with " + slices + " slices, " + people + " people ate " + slicesPerPerson + " slices each");
    }


}
