package main;

import java.util.Scanner;

class Casino{
	Game g1 = new Game();
	String userAnswer;
	Scanner sc = new Scanner(System.in);
	
	public void organizeNewGame() {
		System.out.print("Welcome to our Casino: Would you like to play a game? (y/n): ");
		
		userAnswer = sc.nextLine();
		
		if(userAnswer.equals("y")) {
			System.out.println("let's get started");
			g1.playGame();
		}else {
			System.out.println("Good Bye!");
		}
	}
}
