package hangman.model;

public class OriginalScore implements GameScore{

	public OriginalScore() {
		
	}
	
	@Override
	/**
	 * Calcula el puntaje de la siguiente manera:
	 * Es el esquema actual, se inicia con 100 puntos.
	 * No se bonifican las letras correctas.
	 * Se penaliza con 10 puntos con cada letra incorrecta.
	 * El puntaje minimo es 0.
	 * Precondition: correctCount es un entero positivo
	 * Postcondition: retorna 100 - (10*incorrectCount)
	 * @param correctCount numero de letras acertadas 
	 * @param incorrectCount numero de letras incorrectas 
	 * @return retorna el puntaje actual
	 */
	public int calculateScore(int correctCount, int incorrectCount) {
		return 0;
	}

}
