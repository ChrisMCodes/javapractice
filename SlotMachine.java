/**

 * 
 * Purpose: To create a "slot machine" that takes a customer's bet and calculates his or her winnings.
 * The code must be modular/functional and will include the following options:
 * Cherries, Oranges, Plums, Bells, Melons, and Bars. 
 * 
 * If two match in a "spin," the customer wins twice their bet.
 * If three match, the customer wins thrice their bet.
 */


// Importing scanner and random
import java.util.Scanner;
import java.util.Random;

public class SlotMachine {
  
  
  public static void main(String[] args) { 
    // Declare vars
    double yourBet;
    double yourGains;
    String firstOption;
    String secondOption;
    String thirdOption;
    
    
    // Calls getBet function to get customer's bet
    yourBet = getBet(); // 
    
    // Calls randOption function to get "spins" on each wheel of the slot machine
    firstOption = randOption();
    secondOption = randOption();
    thirdOption = randOption();
    
    // Displays result of spin
    System.out.println("");
    System.out.println("Your spin is: ");
    System.out.println("");
    System.out.println(firstOption + "   " + secondOption + "   " + thirdOption);
    System.out.println("");
    
    // Gets payout
    yourGains = getPayout(firstOption, secondOption, thirdOption, yourBet);
    // Displays customer's winnings
    if (yourGains > 0){
    System.out.println("In this round, you won $" + yourGains + "!");
    } else {
    System.out.println("It doesn't look like you had a match this time. Better luck next time!");
    }
  } // End of main
  
  // Function to return the user's bet
  public static double getBet(){
    
    // Defines the Scanner input var
    Scanner input = new Scanner(System.in);
    
    // Initializes var for bet
    double bet = 0; // Getting initialization errors for this, so the default is now 0
    
    // Displays message to user
    System.out.println("How much would you like to bet? $");
    
    try {
    bet = input.nextDouble();
    }
    catch (Exception e) {
    System.out.println("The value entered was not a valid number. For now, your bet is $0.");
    }
    return bet;
  } // End of getBet
  
  // Function to choose the values of each "rung":
  public static String randOption(){
    // Define rand as new random option
    Random rand = new Random();
    
    // Initializes randomized variable:
    int randomChoice = rand.nextInt(6);
    String finalChoice = "Test value"; // This function throws an error if I don't initialize this first.
    String[] possibleChoices = {"Cherry", "Orange", "Plum", "Bell", "Melon", "Bar"};
    
    finalChoice = possibleChoices[randomChoice];

    return finalChoice;
  } // End of randOption
  
  // Calculates whether first/second/third have matches and calculates payout accordingly 
  public static double getPayout(String first, String second, String third, double bet) {
    // variable for payout initialized to 0
    double payout = 0;
    
    if ((first.equals(second)) && (first.equals(third))) {
      payout = bet*3;
    }
     else if ((first.equals(second)) || (first.equals(third)) || (second.equals(third))) {
      payout = bet*2;  
    }
     else {
      payout = bet-bet;
     }
  return payout;
  } // End of getPayout
}
