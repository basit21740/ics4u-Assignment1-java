/*
* This is Rock Paper Scissors program.
*
* @author  Abdul Basit Butt
* @version 1.0
* @since   2022-02-15
* Class RPS program.
*/

import java.util.Random;
import java.util.Scanner;

/**
* This is the calculating heating time program.
*/
final class RockPaperScissors {
    /**
    * Created constant.
    */
    public static final String ROCK = "rock";
    /**
    * Created constant.
    */
    public static final String SCISSORS = "scissors";
    /**
    * Created constant.
    */
    public static final String PAPER = "paper";
    /**
    * Created constant.
    */
    public static final String WIN = "\nYOU WON!!!!";
    /**
    * Created constant.
    */
    public static final String LOST = "\nYou lost...";

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    *
    */
    private RockPaperScissors() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final String[] plays = {ROCK, PAPER, SCISSORS};
        final Random rand = new Random();

        final Scanner scanner = new Scanner(System.in);
        System.out.println("Rock, Paper, or Scissors!?");
        final String input = scanner.nextLine();

        final int playNum = rand.nextInt(3);
        final String play = plays[playNum];
        final String playerPlay = input.toLowerCase();

        System.out.println("\nThe machine chose: " + play);

        if (playerPlay.equals(play)) {
            System.out.println("\nIt is a tie...");
        } else if (ROCK.equals(playerPlay)) {
            if (SCISSORS.equals(play)) {
                System.out.println(WIN);
            } else {
                System.out.println(LOST);
            }
        } else if (PAPER.equals(playerPlay)) {
            if (ROCK.equals(play)) {
                System.out.println(WIN);
            } else {
                System.out.println(LOST);
            }
        } else if (SCISSORS.equals(playerPlay)) {
            if (PAPER.equals(play)) {
                System.out.println(WIN);
            } else {
                System.out.println(LOST);
            }
        } else {
            System.out.println(
                "\nThe only possible inpust are: 'rock', 'paper' and 'scissors'"
            );
        }

        System.out.println("\nDone.");
    }
}
