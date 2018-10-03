package edu.parrish.java.hangman;

public class HangmanWord {
    //variable for the word the user is trying to guess
    String word= "Guitar";

    //This is the method for itterating through the word and masking it
    public void maskword()
    {
        String unmaskedword = word;
        for (int i = 0; i < unmaskedword.length(); i++){
            char letter = word.charAt(i);
            String replacechar = word.replace(letter, '_');
            String maskedword = replacechar.toString();
            System.out.print(maskedword);
        }

    }

}

