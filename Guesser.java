// Guesser.java

import java.util.*

public class Guesser {
	public Guesser() {
		int userChoice = this.menu();
		if userChoice == 1 { // user chooses the Human Guesser game
			this.userGuess
		}
	} // end constructor
	
	public void userGuess() { // begine Human Guesser game
		try {
		int correct = (int)((Math.random() * 100) + 1);
		int guess = 0;
		int numGuesses = 0;
		Scanner input = new Scanner(System.in);
		boolean keepGoing = true;
		while(keepGoing) {
			numGuesses += 1;
			System.out.print(numGuesses + ") Guess a number between 1-100: ");
			guess = input.nextLine();

		} // end while
		} // end try
	} // end userGuess
} // end Guesser
