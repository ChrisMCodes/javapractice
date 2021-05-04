import java.text.DecimalFormat;
import java.util.ArrayList;

public class FiveChallenges {
	public static void main(String[] args) {
		// calculate the sum of three given numbers
		System.out.println(getSum(5, 5, 5));
		System.out.println(getSum(-5, -5, -5));
		System.out.println(getSum(-1, 0, 1));
		System.out.println(getSum(Math.PI, 0, -Math.exp(1)));
		
		// get square root rounded to three decimal places
		System.out.println(getSqrtRoundedToThreeDec(4));
		System.out.println(getSqrtRoundedToThreeDec(0.45));
		System.out.println(getSqrtRoundedToThreeDec(4.1));
		System.out.println(getSqrtRoundedToThreeDec(1555));
		
		// return quotient rounded to two places and remainder
		System.out.println(getQuotientAndRemainder(179, 176));
		System.out.println(getQuotientAndRemainder(0, 176));
		System.out.println(getQuotientAndRemainder(15.5, 3));
		System.out.println(getQuotientAndRemainder(-13, 4));
		
		// return Even or Odd for given Integer
		System.out.println(checkEvenOrOdd(-5));
		System.out.println(checkEvenOrOdd(-6));
		System.out.println(checkEvenOrOdd(0));
		System.out.println(checkEvenOrOdd(13));
		
		// return factors of a positive integer
		System.out.println(getFactors(25));
		System.out.println(getFactors(27));
		System.out.println(getFactors(260));
		System.out.println(getFactors(270));
		
	}
	
	public static double getSum(double a, double b, double c) {
	    double sum = a + b + c;
	    return sum;
	}
	
	public static String getSqrtRoundedToThreeDec(double num) {
	    DecimalFormat df = new DecimalFormat("#.###");
	    double sqrt = Math.sqrt(num);
	    return df.format(sqrt); 
	}
	
	public static String getQuotientAndRemainder(double num1, double num2) {
	    double quotient = num1 / num2;
	    double remainder = num1 % num2;
	    return String.format("quotient: %.2f, remainder: %.2f", quotient, remainder);
	}
	
	public static String checkEvenOrOdd(int num) {
	    String output = (num % 2 == 0) ? "Even":"Odd";
	    return output;
	}
	
	public static String getFactors(int num) {
	    ArrayList<Integer> factors = new ArrayList<>();
	    
	    for (int i = 1; i <= num / 2; i++) {
	        if (num % i == 0) { factors.add(i); }
	    }
	    factors.add(num);
	    return factors.toString();
	}
}
