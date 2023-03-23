import java.sql.SQLOutput;

public class IfElseChallenge {
    public static void main(String[] args) {
       int scoreFromMethod =  calculateScore(1000, 5, 344, true);
        System.out.println(scoreFromMethod);
    }

    public static int calculateScore(int score, int levelCompleted, int bonus, boolean gameOver) {
        int finalScore = 0;
        if(gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("your final score was  " +  finalScore);
        }
        return finalScore;
    }


}
