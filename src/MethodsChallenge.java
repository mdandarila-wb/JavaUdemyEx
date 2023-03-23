public class MethodsChallenge {

    public static void main(String[] args) {
        displayHighScorePosition("vasile",calculateHighScorePosition(1500 ));
        displayHighScorePosition("Tim",calculateHighScorePosition(1000));
        displayHighScorePosition("Gyury",calculateHighScorePosition(500 ));
        displayHighScorePosition("Marcel",calculateHighScorePosition(100 ));
        displayHighScorePosition("Mitru",calculateHighScorePosition(25 ));
    }

    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list" );
    }

    public static int calculateHighScorePosition(int playerScore) {
        int playerPosition = 4;
        if(playerScore >= 1000){
            playerPosition = 1;
        } else if (playerScore >= 500 ) {
            playerPosition = 2;
        } else if (playerScore >= 100 ) {
            playerPosition = 3;
        }
        return playerPosition;
    }
}
