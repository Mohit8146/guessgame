package main;

import java.util.Scanner;

class Player{
	Scanner sc = new Scanner(System.in);
	public int getPlayerGuess() {
		System.out.print("Your Guess: ");
		String userGuess = sc.nextLine();
		return Integer.valueOf(userGuess);
	}
}