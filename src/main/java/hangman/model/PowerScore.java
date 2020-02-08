package hangman.model;

public class PowerScore implements GameScore{

	public PowerScore() {
		
	}
	
	@Override
	/**
	 * El juego inicia en 0 puntos.
	 * La $i-ésima$ letra correcta se bonifica con $5^i$.
	 * Se penaliza con 8 puntos cada letra incorrecta.
	 * El puntaje mínimo es 0
	 * Si con las reglas anteriores sobrepasa 500 puntos, el puntaje es 500.
	 * Precondition: correctCount es un entero positivo
	 * Postcondition: retorna (5^correctCount) - (8*incorrectCount), debe ser positivo el resultado y a lo sumo como 500
	 * @param correctCount numero de letras acertadas 
	 * @param incorrectCount numero de letras incorrectas 
	 * @return retorna el puntaje actual
	 */
	public int calculateScore(int correctCount, int incorrectCount) throws HangmanException {
		int result= (int) ((Math.pow(5,correctCount)) - (8*incorrectCount));
		if (correctCount<0 || incorrectCount<0) throw new HangmanException(HangmanException.NO_NEGATIVOS);
		if (result<0) result=0;
		if (result>500) result=500;
		return result;
	}

}
