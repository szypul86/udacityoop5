// imort of needed Scanner class
import java.util.Scanner;


public class NumberGame {
    public static void main(String [] args){

        System.out.println("I picked a number between 1 and 100, and it is your turn to guess it!");
        //random pick of a number to be found
        int randomNumber = (int)(100* Math.random()) + 1;
        // set a number of valid guesses
        int counter = 10;
        boolean guess = false;


        Scanner guessScanner = new Scanner(System.in);
        //iterate counter times
        for (int i = 0; i < counter; i++) {
            System.out.println("you have " + (counter - i) + " guess(es) left");
            int number = guessScanner.nextInt();
            if (number < randomNumber) {
                System.out.println("Your guess is too low. Guess again.");
            }
            else if (number > randomNumber) {
                System.out.println("Your guess is too high. Guess again.");
            }
            else {
                System.out.println("that's correct. you won with " + (i+1) + " guesses");
                guess = true;
                break;
            }
        }
        //if not guessed
        if (!guess)
            System.out.println("you loose.");
    }
}