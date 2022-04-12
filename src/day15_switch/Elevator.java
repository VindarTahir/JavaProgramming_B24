package day15_switch;

public class Elevator {

    public static void main(String[] args) {

        int floorNum = 4;

        switch (floorNum){

            case 1:
                System.out.println("This is going to floor 1");
                System.out.println("The companies on this floor are: Lobby, Verizon, Starbucks");
                break;

            case 2:
                System.out.println("Going to floor 2");
                System.out.println("The companies on this floor are: Cybertek, Sony, Walmart");
                break;

            case 3:
                System.out.println("Going to floor 3");
                System.out.println("The companies on this floor are: Honda, Toyota, Suzuki");
                break;

            case 4:
                System.out.println("Going to floor 4");
                System.out.println("The companies on this floor are: Crunchyroll, Funimation, KissAnime");
                break;

            default:
                System.out.println("Sorry, we don't recognize that floor :(");
                break;




        }



    }

}
