/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.setup.guice;

import hangman.model.BonusScore;
import hangman.model.French;

/**
 *
 * @author 2106913
 */

import hangman.model.GameScore;
import hangman.model.Language;
import hangman.model.OriginalScore;
import hangman.model.PowerScore;
import hangman.model.Spanish;
import hangman.model.dictionary.FrenchDictionaryDataSource;
import hangman.model.dictionary.HangmanDictionary;
import hangman.model.dictionary.SpanishDictionaryDataSource;
import hangman.view.HangmanPanel;
import hangman.view.HangmanColoridoPanel;
import hangman.view.HangmanNoviolentoPanel;;

public class HangmanFactoryServices extends com.google.inject.AbstractModule {

    @Override
    protected void configure() {
        /* Guice dependency injection */
    	/*VALORES DE COFIGURACION
         bind(GameScore.class).to(OriginalScore.class);
         bind(Language.class).to(French.class);
         bind(HangmanDictionary.class).to(FrenchDictionaryDataSource.class);
         bind(HangmanPanel.class).to(HangmanNoviolentoPanel.class);*/
    	bind(GameScore.class).to(PowerScore.class);
    	bind(Language.class).to(Spanish.class);
        bind(HangmanDictionary.class).to(SpanishDictionaryDataSource.class);
        bind(HangmanPanel.class).to(HangmanColoridoPanel.class);
         
        
    }

}
