package test.java;

import hangman.model.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;



/**
 * 
 * @author 
 * Clases de equivalencia:
 * 1. OriginalScore:
 *	1.1 El valor no puede ser negativo
 *	1.2 El valor es positivo
 *  1.3 El resultado es menor a 0
 *	Condiciones de frontera: 0<=n<=∞
 *
 * 2. BonusScore
 * 	2.1 El valor no puede ser negativo
 *	2.2 El valor es positivo
 *	2.3 El resultado es menor a 0
 * Condiciones de frontera: 0<=n<=∞
 *
 * 3. PowerBonusScore
 * 	3.1 El valor no puede ser negativo
 *	3.2 El valor es positivo
 *	3.3 El puntaje es a lo sumo 500
 *	3.4 El resultado es menor a 0
 *	Condiciones de frontera: 0<=n<=500

 */


public class GameScoreTest {
	
   /*PRUEBAS OriginalScore*/
    @Test
    public void validateOriginalScore1() {
    	
		OriginalScore prueba= new OriginalScore();
    	try {
			prueba.calculateScore(-5,-2);
		} catch (HangmanException e) {
			assertTrue(e.getMessage()!=null);
		}
    	
    }
	@Test
    public void validateOriginalScore2() {
    	
		OriginalScore prueba= new OriginalScore();
		int result=prueba.calculateScore(5,1);
		assertEquals(90,result);
    	
    }
	@Test
    public void validateOriginalScore3() {
    	
		OriginalScore prueba= new OriginalScore();
		int result=prueba.calculateScore(0,12);
		assertEquals(0,result);
    	
    }
	@Test
    public void validateOriginalScoreFrontera() {
    	
		OriginalScore prueba= new OriginalScore();
		int result=prueba.calculateScore(1,10);
		assertEquals(0,result);
    }
    
    /*PRUEBAS BonusScore*/
	@Test
    public void validateBonusScore1() {
    	
		BonusScore prueba= new BonusScore();
    	try {
			prueba.calculateScore(-5,-10);
		} catch (HangmanException e) {
			assertTrue(e.getMessage()!=null);
		}
    	
    }
	@Test
    public void validateBonusScore2() {
    	
		BonusScore prueba= new BonusScore();
		int result=prueba.calculateScore(5,1);
		assertEquals(45,result);
    	
    }
	@Test
    public void validateBonusScore3() {
    	
		BonusScore prueba= new BonusScore();
		int result=prueba.calculateScore(2,10);
		assertEquals(0,result);
    	
    }
	@Test
    public void validateBonusScoreFrontera() {
    	
		BonusScore prueba= new BonusScore();
		int result=prueba.calculateScore(5,10);
		assertEquals(0,result);
    }
	
	/*PRUEBAS PowerBonusScore*/
	@Test
    public void validatePowerScore1() {
    	
		PowerScore prueba= new PowerScore();
    	try {
			prueba.calculateScore(-6,-8);
		} catch (HangmanException e) {
			assertTrue(e.getMessage()!=null);
		}
    	
    }
	@Test
    public void validatePowerScore2() {
    	
		PowerScore prueba= new PowerScore();
		int result=prueba.calculateScore(5,1);
		assertEquals(45,result);
    	
    }
	@Test
    public void validatePowerBonusScore2() {
    	
		PowerScore prueba= new PowerScore();
		int result=prueba.calculateScore(1,20);
		assertEquals(0,result);
    	
    }
	@Test
    public void validatePowerBonusScoreFrontera1() {
    	
		PowerScore prueba= new PowerScore();
		int result=prueba.calculateScore(10,10);
		assertEquals(500,result);
    }
	@Test
    public void validatePowerBonusScoreFrontera2() {
    	
		PowerScore prueba= new PowerScore();
		try{
			int result=prueba.calculateScore(2,4);
		}catch (HangmanException e){
			assertTrue(e.getMessage()!=null);
		}
    }
}