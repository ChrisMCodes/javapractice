import java.util.Scanner;
import java.util.Random;

public class MagicEightBall {
  
  
  public static void main(String[] args) { 
    // Variables
    String question;
    String outcome;
    
    // Asks the question
    yourQuestion();
    
    // Seeks answer
    outcome = yourOutcome();
    System.out.println(outcome);

  }
  
  public static void yourQuestion(){
    String question;
    
    // Setting scanner
    Scanner input = new Scanner(System.in);
    
    // Asks a question, but doesn't actually return any input
    System.out.println("Ask me a question about your future and I will determine whether it will come to pass.");
    question = input.nextLine();
    
  
  }
  
  public static String yourOutcome(){
    String newOutcome;
    int chooseOutcome;
    
    // Array of all possible responses:
    String[] allOutcomes = {"It shall be so", "It shall not be so", "It looks likely", "It looks unlikely", "You are in luck", "Your luck will run short", "Absolutely", "Never", "Your wish is my command", "Perhaps you would do better to change your wish", "Of course!", "Of course not!", "It is your lucky day", "Today isn't your day", "The odds are ever in your favor", "You are more likely to be struck by lightning", "Perhaps", "Perhaps not", "If you wish", "Are you sure you do want to ask that?", "Your happiness is ensured", "Don't bet on it"};
    
    // Initializes randomizer
    Random rand = new Random();
    
    chooseOutcome = rand.nextInt(allOutcomes.length - 1);
    
    newOutcome = allOutcomes[chooseOutcome];
    
    return newOutcome;
    
  }
  
}
