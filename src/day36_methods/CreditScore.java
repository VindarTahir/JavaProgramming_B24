package day36_methods;

public class CreditScore {

    public static void main(String[] args) {

        getCreditScore();
        System.out.println(getCreditScore());
        int score = getCreditScore();
        System.out.println(score);

        System.out.println(hasGoodCreditScore(860));
        System.out.println(hasGoodCreditScore(700));

        if (hasGoodCreditScore(600)){
            System.out.println("Good score");
        } else {
            System.out.println("Bad score");
        }
    }

    public static int getCreditScore(){
        return 800;
    }

    public static boolean hasGoodCreditScore(int score){

        if (score > 750){
            return true;
        } else {
            return false;
        }
    }
}
