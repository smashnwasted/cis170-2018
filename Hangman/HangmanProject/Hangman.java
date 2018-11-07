package HangmanProject;

import java.util.Scanner;
import java.util.Random;

public class Hangman {

   /* public static void main(String[] args){


    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    String[] guesses = {""};

    boolean weArePlaying = true;
    while (weArePlaying) {
        System.out.println("welcome to my game of Hangman");
        char[]  randomWordtoGuess = guesses[random.nextInt(guesses.length)].toCharArray();
        int ammountOfguesses = randomWordtoGuess.length;
        char[] playerGuesses =new char[ammountOfguesses];

        for (int i = 0; i < playerGuesses.length; i++) {
                playerGuesses[i] = '_';
                }
        boolean wordisguessed = false;
        int tries = 0;
        while (!wordisguessed && tries != ammountOfguesses){
            System.out.print("current guess:");
            printArray(playerGuesses);
            System.out.printf("you have %d tries left. \n", ammountOfguesses = tries);
            System.out.println("Enter a single character");
            char input = scanner.nextLine().charAt(0);
            tries++;

            if(input == '_') {
                weArePlaying = false;
                wordisguessed = true;
                }
                else {
                    for( int i = 0; i < randomWordtoGuess.length; i++){
                        if (randomWordtoGuess[i] == input){
                            playerGuesses[i] = input;
                        }
                    }
                if (isTheWordGuessed(playerGuesses)){
                    wordisguessed = true;
                    System.out.println("congratulations you won!");
                }
            }
        }
        if (!wordisguessed) System.out.println("you ran out of guesses i/");
        System.out.println("Do you want to play another game? (yes/no)")
        String anotherGame = scanner.nextLine();
        if (anotherGame.equals("no")) weArePlaying = false;
        }
        public static void printArray{char[] array){
            for (int i = 0; i <array.length; i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
        public static boolean isTheWordGuessed(char[] array) {
        for (int i = 0; i < array.length; i++){
            if (array[i] == '_') return false;
            }
                return true;
            }

        }
    }*/
    }
