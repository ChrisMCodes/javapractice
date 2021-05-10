import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;


public class PythonChallenges11to15 {

	public static void main(String[] args) {
		System.out.println(checkFriThirteen(2021, 8));
		System.out.println(checkDivision(220, 13));
		System.out.println(calculateLength());
		System.out.println(booleans(5>3, true, 5<3));
		System.out.println(factorial(10));
	}
	
	/*
	 * Return whether a given month
	 * and year had a Friday the 13th 
	 */
	public static boolean checkFriThirteen(int yr, int mo) {
		int day = 13;
		GregorianCalendar cal = new GregorianCalendar();
		cal.set(yr - 1900, mo, day);
		return cal.get(Calendar.DAY_OF_WEEK) == 6; 
	}
	
	/*
	 * "Given two numbers a and b, create a function"
     * "that returns the next number greater than a and b"
     * "and divisible by b"
	 */
	public static int checkDivision(int a, int b) {
		return ((Math.max(a, b)) / b + 1) * b;
	}
	
	/*
	 * Write a function that chooses a random number 'n'
     * from 1 to 5000 (inclusive) and then calculates
     * the length of this number. 
	 */
	public static int calculateLength() {
		Random r = new Random();
		int num = 1 + r.nextInt(5000 - 1);
		int count = 0;
		System.out.println(num);
		
		while (num > 0) {
			num /= 10;
			count++;
		}
	
		return count;
		
	}
	/*
	 * Determines whether at least two of three
	 * boolean arguments are true
	 */
	public static boolean booleans(boolean x, boolean y, boolean z) {
		int count = 0;
		boolean bools[] = new boolean[3];
		bools[0] = x;
		bools[1] = y;
		bools[2] = z;
		
		for (boolean b:bools) {
			if (b) {
				count++;
			}
		}
		return count > 1;
	}
	
	/*
	 * Given a num, return the factorial
	*/
	public static long factorial(long num) {
		long total = num;
		if (num < 2) {
			return total;
		}
		return total * factorial(num - 1);
	}
}