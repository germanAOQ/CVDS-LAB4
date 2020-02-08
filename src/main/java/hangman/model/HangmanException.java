package hangman.model;

public class HangmanException extends Exception{
	
	public static String NO_NEGATIVOS = "No se permiten numero negativos";
	
	
	public HangmanException(String msg) {
        super(msg);
	}
}
