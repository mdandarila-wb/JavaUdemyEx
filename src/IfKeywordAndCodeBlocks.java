public class IfKeywordAndCodeBlocks {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 300;
        int levelCompleted = 5;
        int bonus = 100;

        if(score < 5000 && score > 1000){
            System.out.println("Your score was less 5000 but you still got 1000");
        } else if (score < 1000){
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("whaaat");
        }
    }
}
