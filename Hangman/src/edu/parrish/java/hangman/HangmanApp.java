package edu.parrish.java.hangman;

public class HangmanApp {
    /**
     *
     *
     * Method to start game
     *      "play game? Y(yes), N(no)"
     *Method to start game:
            *String = words
            *Method that masks word

     *Method that sets and loops stage:
        *default image
        *Loop that progresses image if incorrect answer

     * Method that prompts User Input:
        *---"Please guess a letter",
        * Logical method that advances correct or incorrect answer
     *
     **/
    public static void main(String[] args)
    {
       HangmanWord newgame = new HangmanWord();
       newgame.maskword();

    }

}
