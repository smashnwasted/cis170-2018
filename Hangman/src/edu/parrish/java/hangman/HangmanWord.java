package edu.parrish.java.hangman;

public class HangmanWord {
    String word = "Guitar";

    public void maskword()
    {

        for (int i = 0; i < word.length(); i++) {

            System.out.print("*");

        }
    }

    public void printwordlength(){
        int wordnumber = word.length();
        System.out.println(wordnumber);
    }
}

