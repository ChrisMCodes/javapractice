import java.util.Scanner;

public class changeCalc {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        double change;
        double quarters;
        double changeQuarters;
        double dimes;
        double changeDimes;
        double nickels;
        double changeNickels;
        double pennies;

        // Collects and initializes change
        System.out.println("Enter the amount of change: ");
        change = input.nextDouble();
	
	// Just test cases. Commented out for now.        
	//System.out.println("Testing that we captured the change correctly: ");
        //System.out.println("The amount of change you entered was: " + change);
        //System.out.println("And that number minus 0.1 is: " + (change - 0.1));


	// Calculates quarters first
	quarters = change/0.25;
	// Drops decimal value
	quarters = (int) quarters;
        // Calculates change after quarters
	// Using a new variable for this to prevent confusion
        changeQuarters = change - quarters*0.25;

	// Calculates dimes after quarters
	dimes = changeQuarters/0.1;
	dimes = (int) dimes;
	changeDimes = changeQuarters - dimes*0.1;

	// Calculates nickels after dimes
	nickels = changeDimes/0.05;
	nickels = (int) nickels;
	changeNickels = changeDimes - nickels*0.05;

	// Calculates pennies last
	pennies = changeNickels/0.01;
	pennies = Math.round(pennies); // Corrects weird binary division results

	// Displays final result
	System.out.println("You should tend " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies.");
    }


}
