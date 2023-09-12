/*
Starter Code for Assignment 1: Sports Scorekeeper - Arrays
Delaware Technical Community College
CSC164 - Computer Science II
Fall 2023
*/
import java.util.Random;

public class SportsScorekeeper {
    public static void main(String[] args) {

        final int NUM_GAMES = 10;
        final int NUM_PERIODS = 2;
        final int HIGH_SCORE_PER_PERIOD = 5;
        final int LOW_SCORE_PER_PERIOD = 0;

        int[][] teamScores = new int[NUM_GAMES][NUM_PERIODS];

        Random rng = new Random();
        // Set random number generator, so it provides the same random numbers every time
        // If you remove this line, the program will produce pseudorandom numbers that are different every time
        rng.setSeed(0);

        // Assign random scores to each period for each game
        for (int i = 0; i < NUM_GAMES; i++) {
            for (int j = 0; j < NUM_PERIODS; j++) {
                teamScores[i][j] = rng.nextInt(LOW_SCORE_PER_PERIOD, HIGH_SCORE_PER_PERIOD+1);
            }
        }

        // display scores for every game
        for (int i = 0; i < NUM_GAMES; i++) {
            System.out.println("\nThis team, in game # " + (i + 1));
            for (int j = 0; j < NUM_PERIODS; j++) {
                System.out.println("In period # " + (j+1) + " this team scored: " + teamScores[i][j]);
            }
        }

    }

}
