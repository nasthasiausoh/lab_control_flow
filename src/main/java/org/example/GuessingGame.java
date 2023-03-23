package org.example;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {

//        Sudo code:
//        Prompt a user to input their guess
        System.out.println("Guess the secret number!");

//        Collect user input
        Scanner reader = new Scanner(System.in);
        int numberGuessed = reader.nextInt();

//        The secret number is 4. If numberGuessed=4, print 'Bingo!'
//        Otherwise, print 'Better luck next time.'
        if (numberGuessed == 4) {
            System.out.println("Bingo! Well done, you guessed the secret number.");

        } else if (numberGuessed < 4) {
            System.out.println("Your guess is too low. Try again.");

        } else {
            System.out.println( "Your guess is too high. Try again.");
        }

    }



}
