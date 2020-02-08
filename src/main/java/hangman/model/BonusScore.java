package hangman.model;

public class BonusScore implements GameScore{

	public BonusScore() {
		
	}

	@Override
	/**
	 * El juego inicia en 0 puntos.
	 * Se bonifica con 10 puntos cada letra correcta.
	 * Se penaliza con 5 puntos cada letra incorrecta.
	 * El puntaje mínimo es 0
	 * Precondition: correctCount es un entero positivo
	 * Postcondition: retorna (10*correctCount) - (5*incorrectCount) y debe ser positivo el resultado
	 * @param correctCount numero de letras acertadas 
	 * @param incorrectCount numero de letras incorrectas 
	 * @return retorna el puntaje actual
	 */
	public int calculateScore(int correctCount, int incorrectCount) throws HangmanException {
		int result= (10*correctCount) - (5*incorrectCount);
		if (correctCount<0 || incorrectCount<0) throw new HangmanException(HangmanException.NO_NEGATIVOS);
		if (result<0) result=0;
		return result;
	}
}
