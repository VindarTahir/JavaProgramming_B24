package dardan_questions;

public class Quiz {
    /*
    create a class Quiz
    instance variables:
    - topic (String)
    - total number of questions (int)
    - total points (double)
    constructor:
    - initialize all variables
    methods:
    - toString: print all the quiz information
    - takeQuiz(): print: Taking the $topic quiz

     */
    String topic;
    int totalNumOfQuestions;
    double totalPoints;

    public Quiz(String topic, int totalNumOfQuestions, int totalPoints) {
        this.topic = topic;
        this.totalNumOfQuestions = totalNumOfQuestions;
        this.totalPoints = totalPoints;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "topic='" + topic + '\'' +
                ", totalNumOfQuestions=" + totalNumOfQuestions +
                ", totalPoints=" + totalPoints +
                '}';
    }

    public void takeQuiz(String topic){
        System.out.println("taking the " + topic);
    }
}

