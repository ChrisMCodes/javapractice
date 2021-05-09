public class PythonChallenges6to10 {

	public static void main(String[] args) {
		power(4, 3);
		decimalPart(4.13215);
		FizzBuzz(15);
		numDigits("Th3 d4y 15 h3r3");
		System.out.println(sumPosDiv(14));
	}
	
	public static long power(int x, int y) {
		long output = (long) Math.pow(x, y);
		System.out.println(output);
		return output;
	}

	/*
	 * Write a function that returns the decimal part of a number to two decimal places
	 */
	public static void decimalPart(double num) {
		int divisor = (int)num / 1;
		double dec = num % divisor;
		System.out.printf("%.2f\n", dec);
	}
	
	/*
	 * FizzBuzz
	 */
	public static void FizzBuzz(int max) {
		for (int i = 1; i <= max; i++) {
			if (i % 15 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
		}
	}
	
	/*
	 * Count number of numerical digits in a string
	 */
	public static int numDigits(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				count++;
			}
		}
		System.out.println("Number of digits: " + count);
		return count;
	}
	
	/*
	 * Checks if a number is equal
	 * to the sum of its positive
	 * divisors, except itself
	 */
	public static boolean sumPosDiv(int num) {
		int total = 0;
		for (int i = 1; i < (num / 2) + 1; i++) {
			if (num % i == 0) {
				total++;
			}
			if (total > num) {
				return false;
			}
		}
		if (total == num) {
			return true;
		}
		return false;
	}
}
