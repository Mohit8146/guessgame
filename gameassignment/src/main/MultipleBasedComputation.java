package main;

public class MultipleBasedComputation implements ResultComputation{
	@Override
	public boolean computeResult(int computerGuess, int playerGuess) {
		boolean result = true;
		if(playerGuess%3 == 0 || playerGuess%4 == 0) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}
}

