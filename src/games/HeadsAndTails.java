package games;

import java.util.Random;
import java.util.Scanner;

public class HeadsAndTails {

    public static void main(String[] args) {

        String yourGuess;
        int yourGuessNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your guess: ");
        yourGuess = scanner.next();
        scanner.close();

        if (!yourGuess.equals("head") && !yourGuess.equals("tail")) {
            System.out.println("Try again, next time enter 'head' or 'tail'.");
            System.exit(0);
        }

        if (yourGuess.equals("head")) {
            yourGuessNumber = 0;
        } else {
            yourGuessNumber = 1;
        }

        int headOrTail = new Random().nextInt(2);
        if (headOrTail == yourGuessNumber) {
            System.out.println("You won!!!");
        } else {
            System.out.println("You lost.");
        }
    }
}
