package main;

import java.util.Random;

class Game{
	Random rand = new Random();
	private int computerGuess = -1;
	private int playerGuess = -1;
	Player p1 = new Player();
	ResultComputation rc = new RangeBasedComputation();
	
	public void playGame(){
		System.out.println("Guess a number from 1 to 100");
		System.out.println("And I will guess a game");
		System.out.println("If your guess is within 20 of my guess: then you win. Else I will win!");
		System.out.println("There will be 5 rounds.");
		
		for(int i = 1 ; i <= 5 ; i++) {
			System.out.println();
			System.out.println("Round "+i);
			
			// Taking input from the user
			playerGuess = p1.getPlayerGuess();
			computerGuess = computerGuess();
			
			System.out.println("Computer Guess is: "+computerGuess);
			System.out.println("Your Guess is: "+playerGuess);
			
			printResults();
		}
		
	}
	
	private void printResults() {
		if(rc.computeResult(computerGuess, playerGuess)) {
			System.out.println("You Win!!!");
		}else {
			System.out.println("You Lose!!!");
		}
	}

	public int computerGuess() {
		int programGuess = rand.nextInt(100);
		return programGuess;
	}
}
