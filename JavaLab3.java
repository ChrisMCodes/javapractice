/**
  * This one was completed for a course.
  * It's less sophisticated than my other guess-the-number game.
  */
  
import java.io.*;
import java.util.InputMismatchException;

public class JavaLab3 {

    public static void main(String[] args) {
      // first we define our input streams.
      InputStreamReader input = new InputStreamReader(System.in);
      BufferedReader reader = new BufferedReader(input);   
      
      // constant declarations
      final Integer MAGIC_NUMBER = 9; 
      
      // variable declarations
      String   sName;
      Integer  numberGuessed = -1;
      Integer  numberTries = 0;
      
      // we catch exceptions if some are thrown.
      // an exception would be entering a string when a number is expected
      try {
            System.out.println("What is your name?");
            
            // we read a string from the stream
            sName = reader.readLine();  
            
            do{
              
            System.out.println(sName+", what number do you guess between 0 and 10?");
            // parseint will transform a string i.e."123" into a number 123
            numberGuessed = Integer.parseInt(reader.readLine());
            
                // Checking that user input is within range
                while ((numberGuessed < 0) || (numberGuessed > 10)){
            
            
                  System.out.println("The number you entered is outside the valid range.");
                  System.out.println(sName+", what number do you guess between 0 and 10?");
                  numberGuessed = Integer.parseInt(reader.readLine());
                  
                } // while ((numberGuessed < 0) || (numberGuessed > 10))
                
                
              // Increments number of tries once a valid value is entered
              numberTries = numberTries + 1;
              
            
               // this will print "Jane, you picked 3" if they entered Jane and 3
              System.out.println(sName + ", you picked "+ numberGuessed);
              
              
              // if-then-else to guide the user
              if (numberGuessed == MAGIC_NUMBER) {
                
                System.out.println("Congratulations! You guessed the number in " + numberTries + " tries.");
              
              } else if ((numberGuessed > MAGIC_NUMBER)&&(numberTries < 4)){
              
                System.out.println(numberGuessed + " is too high. Let's try again.");
    
              } else if ((numberGuessed < MAGIC_NUMBER)&&(numberTries < 4)){
              
                System.out.println(numberGuessed + " is too low. Let's try again.");
    
              } else{
              
                System.out.println(sName + ", you ran out of guesses. Sorry!");
              
              } 
            
            } while ((numberGuessed != MAGIC_NUMBER) && (numberTries < 4));
            
      } catch (IOException | InputMismatchException | NumberFormatException e){
            System.out.println("Error reading from user.");
	    System.out.println("Please restart the program.");
      }
      
    }
