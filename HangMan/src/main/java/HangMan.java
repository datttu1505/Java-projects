
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author dattu
 */
public class HangMan {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
String[] words = new String[183719];
readWords(words);
// hangman implementation goes below
 
        String guessed = new String(new char[word.length()]).replace("\0", "_");

       boolean playAgain = true;
        while (playAgain) {
           String word = words[(int) (Math.random() * words.length)];
            int maxGuesses = 6;
            int numGuesses = 0;
            String guessedLetters = "";
            String guessedWord = "";
            for (int i = 0; i < word.length(); i++) {
                guessedWord += "-";
            }
            System.out.println("Welcome to Hangman! Guess the word:");
            
            // Guess loop
            while (numGuesses < maxGuesses && !guessedWord.equals(word)) {
                System.out.println("Guesses left: " + (maxGuesses - numGuesses));
                System.out.println("Guessed word: " + guessedWord);
                System.out.println("Guessed letters: " + guessedLetters);
                System.out.print("Guess a letter: ");
                String guess = input.nextLine().toLowerCase();
                if (guess.length() != 1) {
                    System.out.println("Please enter a single letter.");
                } else if (guessedLetters.contains(guess)) {
                    System.out.println("You already guessed that letter.");
                } else if (!word.contains(guess)) {
                    System.out.println("Wrong guess.");
                    numGuesses++;
                    guessedLetters += guess;
                } else {
                    System.out.println("Correct guess!");
                    guessedLetters += guess;
                    String newGuessedWord = "";
                    for (int i = 0; i < word.length(); i++) {
                        if (guessedLetters.contains("" + word.charAt(i))) {
                            newGuessedWord += word.charAt(i);
                        } else {
                            newGuessedWord += "-";
                        }
                    }
                    guessedWord = newGuessedWord;
                }
            }
            
            // Game over
            if (guessedWord.equals(word)) {
                System.out.println("You win! The word was " + word);
            } else {
                System.out.println("You lose! The word was " + word);
            }
            System.out.print("Do you want to play again? (y/n): ");
            String playAgainInput = input.nextLine().toLowerCase();
            if (playAgainInput.equals("y")) {
                playAgain = true;
            } else {
                playAgain = false;
            }
        }
    }

   // Store the words from dictionary.txt in an array
public static void readWords(String[] words)throws IOException {
File dict = new File("dictionary.txt");
try(Scanner in = new Scanner(dict);){
int i=0;
while(in.hasNext()) {
words[i++]=in.next();
            }
}
}
    
}
