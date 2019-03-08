/*
 * Lewis White
 * March 05, 2019
 * This program will simulate hangman
 */

package hangman;

import static javax.swing.JOptionPane.showInputDialog;

/**
 *
 * @author lewhi7273
 */
public class Hangman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int guessCounter = 7;
       int countDowner = guessCounter - 1;
       int j = 0;
       String input = showInputDialog("You have " + (guessCounter - j) + " guesses left! \n"
               + "Guess a letter! ");
       
       //Declare all arrays
       String balls[] = {"soccer", "football","baseball","golf"};
       String foods[] = {"watermelon","pasta","chips","fish"};
       String tvshows[] = {"familyguy","americandad","norsemen", "futurama"};
       String animals[] = {"seal", "walrus", "owl", "giraffe"};
       
      String catagories[][] = {balls,tvshows,foods,animals};
      
       //pick a random catagory and selection
       int rC = (int)(catagories.length*Math.random());
       int rS = (int)(Math.random() * rC);
      String finalSelection =  catagories[rC][rS];
      
      //replace letters from word with hyphens and print
      String word = " ";
      for(int i = 0; i<=finalSelection.length();i++){
       word += "-";
      }
       System.out.println("Your word is: " + word);
       
     
        
       
       //Count the number of guesses and call game over if no guesses remain
       for(j = 1; j<=7; j++){
       
       if(j>=7){
           System.out.println("Game over!");
           
       }
         //see if the letter guessed is in the word
       for(int k = 1; k<=7; k++){
           if (finalSelection.contains(input)){
               String checker = finalSelection.substring(finalSelection.indexOf(input));
              word = word.replace(checker,input);
              System.out.println(word);
              input = showInputDialog("Good job! You have " + (guessCounter) + " guesses left! \n"
               + "Guess a letter! ");
           }else if(j <= 7){
               j++;
                input = showInputDialog("You have " + (countDowner) + " guesses left! \n"
               + "Guess a letter! ");
           }else{
                   System.out.println("Game over!");
                   }
                  
       
    }
    
    }
    }
}
