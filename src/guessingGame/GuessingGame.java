package guessingGame;


import java.util.Scanner;

public class GuessingGame {
    //global variable as it must be accessed from everywhere
    //static identifies members that are not bound to an object.
    static double randomNumber = Math.floor(Math.random() * 100);
    public static void main(String[] args) {

        System.out.println("Pssst! the number is: " + randomNumber);
        guessNumber();
    }

    /**
     * Method, which read an integer from the console and evaluates it against a global, random double (floored)
     * is recursively called if you guessed too low or too high
     * exits if you guess the right value
     */
    public static void guessNumber() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess a number between 0 and 100!");
        int guess = scanner.nextInt();

        if (guess == randomNumber) {
            System.out.println("You won!");
        } else{
            if (guess < randomNumber)
                System.out.println("you have guessed too low! Try again.");
            else
                System.out.println("you have guessed too high! Try again.");

            guessNumber();
        }
    }
}
