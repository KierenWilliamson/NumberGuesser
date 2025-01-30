package src.pgm;

import java.util.Scanner;
import java.util.Random;

public class numGuesser {
	public static void main(String[] args) {
		/*
         * Program Steps
         * 
         * 1. Ask the user to select a difficulty
         * 
         *   Easy: 1-50; 3 guesses
         * 
         *   Medium: 1-100; 2 guesses
         * 
         *   Hard: 1-150; 1 guess
         * -------------------------------------
         * 2. Allow the user to make a guess
         * 
         *      If the guess is higher than the randgen number, say: "the target is lower";
         *      do the inverse if the guess was lower
         * 
         *      if the guess was spot on, say: Spot on!
         *      Game is over
         * 
         */
		numGuesserUtil guesserUtil = new numGuesserUtil();
		guesserUtil.printMenu();
		
		Scanner scnr = new Scanner(System.in);
		int userResponse = scnr.nextInt();
		
		//program was not quit
		while (userResponse != 0) {
			//Check number given is out-of-bounds
			if ((userResponse > 3) || (userResponse < 0)) {
				System.out.println("Enter a number within the options provided.");
			}
			
			Random randObj = new Random();
			int randNum = randObj.nextInt(50 * userResponse) + 1;

			// Let the user guess
			guesserUtil.evalGuess(scnr, userResponse, randNum);
			System.out.println("The correct answer was " + randNum);
			
			//think of a way to clear the console
			guesserUtil.printMenu();
			userResponse = scnr.nextInt();
		}
		
		scnr.close();
	}
}
