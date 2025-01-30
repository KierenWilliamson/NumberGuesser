package src.pgm;

import java.util.Scanner; 

public class numGuesserUtil {
	void printMenu() {
		System.out.println("Select the Difficulty");
		System.out.println("Easy (1): Guess a number between 1 and 50. You get 3 guesses\n");
		System.out.println("Medium (2): Guess a number between 1 and 100; You get 2 guesses\n");
		System.out.println("Hard (3): Guess a number between 1 and 150; You get only 1 guess\n");
		System.out.println("Quit (0)\n");
		System.out.print("What difficulty will you be playing on?: ");
	}
	
	void evalGuess(Scanner scnr, int userResponse, int randNum) {
		for (int i = 0; i < userResponse; i++) {
			System.out.print("Submit your guess: ");
			int userGuess = scnr.nextInt();
			
			if (userGuess == randNum) {
				System.out.println("You've got it!\n");
				break;
			} else {
				System.out.print("Wrong guess.");
				
				if (userGuess > randNum) {
					System.out.println(" Number is lower.\n");
				}
				if (userGuess < randNum) {
					System.out.println(" Number is higher.\n");
				}
			}
		}
	}
}
