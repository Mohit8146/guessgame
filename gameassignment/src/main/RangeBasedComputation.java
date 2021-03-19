package main;

public class RangeBasedComputation implements ResultComputation{

	@Override
	public boolean computeResult(int computerGuess, int playerGuess) {
		return computerGuess-20 <= playerGuess && computerGuess+20 >= playerGuess;
	}

}
