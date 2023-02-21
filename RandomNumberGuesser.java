/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: This program will generate a random number and ask the user to enter their guess.
 * 				Then it will tell them if the number is too low or too high and adjust the range
 * 				accordingly. It will validate the input to make sure that it is within the acceptable
 * 				range. Then once it is guessed correctly, the program will ask if they want to 
 * 				play again.
 * Due: 2/23/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Kevin Sobalvarro
*/

import java.util.Scanner;

public class RandomNumberGuesser {

	public static void main(String[] args) {
		// Scanner object
		Scanner input = new Scanner(System.in);

		// Variables
		int numGuesses = RNG.getCount();	// Number of guesses
		int outOfBoundGuesses = 0;			// Number of guesses that were out of bounds
		int nextGuess; 						// User's input
		int highGuess = 100; 				// Highest guess entered
		int lowGuess = 0; 					// Lowest guess entered
		int randNum = RNG.rand(); 			// Randomly generated number
		String answer; 						// Holds the answer for playing again
		
		do {
			// Ask for first guess
			System.out.println("Enter your first guess");
			nextGuess = input.nextInt();
			
			do {				
				//Data validation
				while (RNG.inputValidation(nextGuess, lowGuess, highGuess) == false) {
					outOfBoundGuesses++;
					nextGuess = input.nextInt();
				}		
				
				numGuesses = RNG.getCount() - outOfBoundGuesses;
				
				// Display number of guesses
				System.out.println("Number of guesses is " + numGuesses);

				// Input validation
				if (nextGuess > randNum) {
					System.out.println("Your guess is too high");
					highGuess = nextGuess;
				} else if (nextGuess < randNum) {
					System.out.println("Your guess is too low");
					lowGuess = nextGuess;
				}

				// Take next guess
				System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
				nextGuess = input.nextInt();

			} while (nextGuess != randNum);

			// Message for a correct guess
			System.out.println("Congratulations, you guessed correctly");

			// Play again message
			System.out.println("Try again? (yes or no)");
			answer = input.next();
			input.nextLine();

			// Reset counter, anti-counter, low, min, and randomNumber
			lowGuess = 0;
			highGuess = 100;
			outOfBoundGuesses = 0;
			RNG.resetCount();
			randNum = RNG.rand();
		} while (answer.equalsIgnoreCase("yes"));

		// Goodbye message
		System.out.println("Thanks for playing...");
		input.close();
		System.exit(0);
	}

}
