package com.javaexplore;

public class MethodSample {

    public static void main(String[] args) {

        int highScore;
        int highScorePosition;

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Eren Jaeger", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Mikasa Ackerman", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Armin Arlert", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Sasha Brauss", highScorePosition);

        //calculateScore(true, 500, 5, 100);

    }

    private static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore += 2000;
        }

        return -1;
    }

    private static void displayHighScorePosition(String playerName, int position) {

        System.out.println(
                String.format("%s managed to get into position %d on the high score table\n",
                playerName, position)
        );
    }

    private static int calculateHighScorePosition(int playerScore) {

        System.out.println("Score: " + playerScore);

        return  playerScore >= 1000 ? 1 : playerScore >= 500 ? 2 : playerScore >= 100 ? 3 : 4 ;
    }
}
