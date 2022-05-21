package games;

import java.util.Random;
import java.util.Scanner;

public class HeadsAndTails {

    public static void main(String[] args) {

        String yourGuess;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your guess: ");
        yourGuess = scanner.next();
        scanner.close();

        if (!yourGuess.equals("head") && !yourGuess.equals("tail")) {
            System.out.println("Try again, next time enter 'head' or 'tail'.");
            System.exit(0);
        }

        if (new Random().nextInt(2) == 0 && yourGuess.equals("head")) {
            System.out.println("You won!!!");
        } else {
            System.out.println("You lost.");
        }
    }
}
