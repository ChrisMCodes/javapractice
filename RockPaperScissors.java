/**
 * This is a 'translation' of the same game I made in Python
 * 
 */

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class RockPaperScissors {
  
  
  public static void main(String[] args) { 
  
    // Initializing new rand and scan variables
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    
    // Global vars
    // Trackers first:
    int win = 0;
    int lose = 0;
    int tie = 0;
    
    // loop var
    String playAgain = "YES";
    
    // numeric hand variables
    int computerNum = rand.nextInt(3) + 1;
    int userNum = -1;
    
    // the numeric hand variables will be converted into a string later
    String computerHand = "";
    String userHand = "";
    
    // The results variable
    String thisRound = "";
    
    
    // main body of program
    while (playAgain.equals("YES") || playAgain.equals("Y")){
    
      userNum = getHand();
      computerNum = rand.nextInt(3) + 1;
      
      computerHand = numToWord(computerNum);
      userHand = numToWord(userNum);
      
      // Displays both hands
      System.out.println("You chose " + userHand + " and the computer chose " + computerHand + ".");
      
      // Determines wins, losses, and draws
      
      if (userNum == computerNum) {
      
        System.out.println("It's a tie!");
        thisRound = "tie";
        
      } else if ((userNum == 1 && computerNum == 2) || (userNum == 2 && computerNum == 3) || (userNum == 3 && computerNum == 1)){
      
        System.out.println("The computer won this time.");
        thisRound = "lose";
        
      } else {
      
        System.out.println("You win!");
        thisRound = "win";
      
      }
      
      
      // tracks values
      
      if (thisRound.equals("win")){
      
        win++;
        
      } else if (thisRound.equals("tie")){
      
        tie++;
      
      } else {
      
        lose++;
        
      }
      
      // Displays score so far
      
      System.out.println("\nSo far, you have won " + win + " times, lost " + lose + " times, and tied " + tie + " times.");
      
      
      // Determines whether the user would like to play again.
      System.out.println();
      
      playAgain = "";
      
      System.out.println("Would you like to play again? [y]es/[n]o\n");
      playAgain = scan.nextLine().toUpperCase();
      
      
    
    } // while (playAgain == true)
    
    
  }
  
  // sets userNum variable in main body of program
  public static int getHand(){
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    int userNum = -1;
    
    while (userNum < 1){
    
      try{
      
        System.out.println("Please enter 1 to choose rock, 2 to choose paper, or 3 to choose scissors.");
        userNum = scan.nextInt();
        
        if ((userNum > 3) || (userNum < 1)){
        
          System.out.println("Sorry! I didn't get that. Let's try again.");
          userNum = -1;
          
        }
      
      }
      catch (InputMismatchException e) {
        
        System.out.println("Sorry! Something went wrong. Your choice has defaulted to an automatically generated random value.");
	userNum = rand.nextInt(3) + 1;
	break;
        
      }
      
    } // while (userNum < 1)
  
    return userNum;
    
  } // getHand()
  
  // Converts numeric data into rock/paper/scissors as a string
  public static String numToWord(int hand){
  
    if (hand == 1) {
    
      return "rock";
        
    } else if (hand == 2) {
      
      return "paper";
        
    } else {
    
       return "scissors";
    
    }
  
  
  } // numToWord()
  
}
