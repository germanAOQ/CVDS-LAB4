package hangman.model;

public class OriginalScore implements GameScore{

	public OriginalScore() {
		
	}
	
	@Override
	public int calculateScore(int correctCount, int incorrectCount) {
		return 0;
	}

}
