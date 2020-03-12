import java.util.Random;
import java.util.Scanner;

public class guessTheNum{

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        // Declaring vars
        int userNum=-1;
        int randNum = new Random().nextInt(101);
        int min = 0;
        int max = 100;

        

        try{
        
            do {
                // Limits the range between the min and max value that the user enters
                
                System.out.println("Please enter an integer between " + min + " and " + max + ".");
                
                userNum = input.nextInt();
                
                // The user's guess was too high.
                if (userNum > randNum) {

                    System.out.println("Try guessing a little lower.\n");
                    
                    if (userNum < max){

                        max = userNum;
                    }
                }
                
                // The user's guess was too low
                else if (userNum < randNum){

                    System.out.println("Try guessing a little higher.\n");

                    if (userNum > min){

                        min = userNum;
                    }

                }
                
                // The user won!
                else {
                    
                    System.out.println("You guessed right! The number was " + randNum + "!");

                }
        
            } while (userNum != randNum);
    }
        // The user's input was not a valid integer
        catch (Exception e){

            System.out.println("Your input was not recognized");
        }

        
    input.close();

    } // main()




} // class HelloWorld
