import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Welcome to Guess Game..!");
        System.out.println("May i have you name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello...! " + name);

        System.out.println("let's start a game.");
        System.out.println("\t1. Yes");
        System.out.println("\t2. No");

        int beginAnswer = scanner.nextInt();

        while (beginAnswer != 1) {
            System.out.println("Shall we begin?");
            System.out.println("\t1. Yes");
            System.out.println("\t2. No");
            beginAnswer = scanner.nextInt();
        }

        Random random = new Random();
        int x = random.nextInt(30) + 1;
        System.out.println("Please guess a number");
        int userAnswer = scanner.nextInt();

        int timesTries = 0;
        boolean hasWon = false;
        boolean shouldFinish = false;

        while (!shouldFinish) {
            timesTries++;

            if (timesTries < 5) {
                if (userAnswer == x) {
                    hasWon = true;
                    shouldFinish = true;
                } else if (userAnswer < x) {
                    System.out.println("Guess higher");
                    userAnswer = scanner.nextInt();
                } else {
                    System.out.println("Guess lower");
                    userAnswer = scanner.nextInt();
                }
            } else {
                shouldFinish = true;
            }
        }

        if (hasWon) {
            System.out.println("Conguralation! you have guessed in your " + timesTries + " guess");
        } else {
            System.out.println("Game Over......! The number was " + x);
        }
    }
}