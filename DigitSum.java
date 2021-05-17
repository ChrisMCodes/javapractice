/**
 * This is inspired by challenges from Tim Buchalka's Java course
 */

public class DigitSum {

	public static void main(String[] args) {
		
		//TODO add test cases

	}
	
	/*
	 * returns sum of digits
	 * for numbers >= 10
	 * 
	 */
	
	public static int sumDigits(int num) {
		int sum = 0;
		int newNum = num;
		int leastSignificantDigit;
		
		if (num < 10) {
			return -1;
		}
		
		while (newNum > 0) {
			leastSignificantDigit = newNum % 10;
			sum += leastSignificantDigit;
			newNum /= 10;
		}
		
		return sum;
	}
	
	/*
	 * returns true if num is a palindrome
	 */
	public static boolean isPalindrome(int num) {
        num = Math.abs(num);
		int reverse = 0;
        int newNum = num;
        int lastDigit;
        
        while (newNum > 0) {
            reverse *= 10;
            lastDigit = newNum % 10;
            reverse += lastDigit;
            newNum /= 10;
        }
        
        return num == reverse;
        
    }
	
	/*
	 * returns sum of only first and last digits
	 * of a positive number
	 */
	public static int sumFirstAndLastDigit(int num) {
		
		if (num < 0) {
			return -1;
		} else if (num < 10) {
			return num * 2;
		}
		
		int firstDigit = 0;
		int lastDigit = num % 10;
		int sum = 0;
		
		while (num / 10 > 0) {
			num /= 10;
			if (num / 10 == 0) {
				firstDigit = num % 10;
			}
		}
		
		return firstDigit + lastDigit;
		
	}
	
	/*
	 * Sum of even digits of positive num
	 */
	public static int getEvenDigitSum(int num) {
		int sum = 0;
		int leastSignificantDigit;
		
		if (num < 0) {
			return -1;
		} else if (num < 10) {
			sum = (num % 2 == 0) ? num:0;
		}
		
		while (num / 10 > 0) {
			leastSignificantDigit = num % 10;
			if (leastSignificantDigit % 2 == 0) {
				sum += leastSignificantDigit;
			}
			num /= 10;
		}
		
		sum = ((num % 10) % 2 == 0) ? (sum + num):sum; 
		
		return sum;
	}
	
	/*
	 * Checks if all numbers are in range 10-1000
	 * and if any have the same last digit
	 */
	
	public static boolean hasSameLastDigit(int first, int second, int third) {
		if (!isValid(first) || !isValid(second) || !isValid(third)) {
			return false;
		}
		
		int firstLastDigit = first % 10;
		int secondLastDigit = second % 10;
		int thirdLastDigit = third % 10;
		
		if (firstLastDigit == secondLastDigit || 
				firstLastDigit == thirdLastDigit ||
				secondLastDigit == thirdLastDigit) {
			return true;
		}
		
		return false;
	}
	
	/*
	 * Checks if the nums above fall within the specified range
	 */
	public static boolean isValid(int num) {
		if (num < 10 || num > 1000) {
			return false;
		}
		return true;
	}
	
	/*
	 * Finds Greatest Common Divisor of two nums
	 */
	
	public static int greatestCommonDivisor(int first, int second) {
		int divisor = 0;
		int max = (first > second) ? first:second;
		
		if (first < 10 || second < 10) {
			return -1;
		}
		
		for (int i = 1; i <= max; i++) {
			if (first % i == 0 && second % i == 0) {
				divisor = i; 
			}
		}
		
		return divisor;
	}
	
	/*
	 * Print all factors of a positive num
	 */
	public static void printFactors(int num) {
		if (num < 1) {
			System.out.println("Invalid Value");
		} else {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					System.out.println(i);
				}
			}
		}
	}

	/*
	 * Finds whether a number is perfect.
	 * This could borrow the method from above,
	 * but I'm avoiding that to keep the challenges
	 * separate
	 */
	public static boolean isPerfectNumber(int num) {
		if (num < 1) {
			return false;
		}
		
		int sumOfFactors = 0;
		
		for (int i = 1; i <= num/2 + 1; i++) {
			if (num % i == 0) {
				sumOfFactors += i;
			}
		}
		System.out.println("Sum: " + sumOfFactors);
		return sumOfFactors == num;
	}
	
	/*
	 * Translates a number to words
	 */
	
	public static void numberToWords(int number) {
		// TODO find number of digits
		// TODO reverse number
		// TODO switch statement to print words
	}
}
