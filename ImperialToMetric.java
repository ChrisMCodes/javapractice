import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ImperialToMetric
{
	public static void main(String[] args) {
	    assertEquals(165.1, calcFeetAndInchesToCentimeters(5, 5), 0);
	    assertEquals(-1, calcFeetAndInchesToCentimeters(-5, 5), 0);
	    assertEquals(-1, calcFeetAndInchesToCentimeters(5, -5), 0);
	    assertEquals(-1, calcFeetAndInchesToCentimeters(5, 13), 0);
	    assertEquals(152.4, calcFeetAndInchesToCentimeters(5), 0);
	    assertEquals(-1, calcFeetAndInchesToCentimeters(-5), 0);
	    
		
	}
	
	public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
	    if (feet < 0 || inches < 0 || inches > 12) { return -1; }
	    
	    return (double) (feetToInches(feet) + inches) * 2.54;
	}
	
	public static double calcFeetAndInchesToCentimeters(int inches) {
	    if (inches < 0) { return -1; }
	    
	   return calcFeetAndInchesToCentimeters(inchesToFeet(inches), remainingInchesAfterFeet(inches)); 
	}
	
	
	
	public static int feetToInches(int feet) {
	    return feet * 12;
	}
	
	public static int inchesToFeet(int inches) {
	    return inches / 12;
	}
	
	public static int remainingInchesAfterFeet(int inches) {
	    return inches % 12;
	} 
}
