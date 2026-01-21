import java.util.Random;//Used for generating random numbers
import java.util.Scanner;

public class NumberGussesSystem {

    static void playGame() {

        Random r = new Random();
        int generatednumber = r.nextInt(100) + 1; // 1 to 100

        try (Scanner sc = new Scanner(System.in)) {
        int userguess = 0;

        System.out.println("Welcome to Number Guessing Game!!");
        System.out.println("Guess Number between 1 to 100");

        while (userguess != generatednumber) {

            int guess = sc.nextInt();
            userguess = guess;   // 🔧 FIXED LINE

            if (guess > generatednumber) {
                System.out.println("Number is Too High!! Guess Again");
            }
            else if (guess < generatednumber) {
                System.out.println("Number is Too Low!! Guess Again");
            }
            else {
                System.out.println("🎉 Congratulations!! You Guessed the Number " + generatednumber);
            }
        }
        }
    }

    public static void main(String[] args) {
        playGame();
    }
}