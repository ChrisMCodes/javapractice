import java.util.Random;
import java.util.Scanner;

public class guessTheNum{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int userNum=-1;
        int randNum = new Random().nextInt(101);
        int min = 0;
        int max = 100;

        

        try{
        
            do {
                System.out.println("Please enter an integer between " + min + " and " + max + ".");
                
                userNum = input.nextInt();

                if (userNum > randNum) {

                    System.out.println("Try guessing a little lower.\n");

                    if (userNum < max){

                        max = userNum;
                    }
                }

                else if (userNum < randNum){

                    System.out.println("Try guessing a little higher.\n");

                    if (userNum > min){

                        min = userNum;
                    }

                }

                else {
                    
                    System.out.println("You guessed right! The number was " + randNum + "!");

                }
        
            } while (userNum != randNum);
    }
        catch (Exception e){

            System.out.println("Your input was not recognized");
        }

        
    input.close();

    } // main()




} // class HelloWorld