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
	public int calculateScore(int correctCount, int incorrectCount) {
		// TODO Auto-generated method stub
		return 0;
	}

}
