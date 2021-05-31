
public class NumberToWord {

	public static void main(String[] args) {
		numberToWords(12345);

	}
		/*********************************************
		 * 
		 * @param number int
		 * prints out string of numbers (each digit)
		 * expressed as words
		 ********************************************/
	    public static void numberToWords(int number) {
	    	// this will eventually be the output
	        String numAsWords = "";
	        
	        // just working with positives for now
	        if (number < 0) {
	            System.out.println("Invalid Value");
	            // this else-if condition allows
	            // the program to work with 0,
	            // which escapes our digit counter
	        } else if (number == 0) {
	        	numAsWords += "Zero";
	        } else {
	        	// since we tried to do this
	        	// mathematically, rather than
	        	// using strings or arrays,
	        	// the number has to be reversed
	            int reversed = reverse(number);
	            // but then we have to account for
	            // trailing zeroes (such as 100)
	            int digits = getDigitCount(number);
	        
	        number = reversed;
	            
	            while (number > 0) {
	                int remainder = number % 10;
	                number /= 10;
	                
	                switch (remainder) {
	                    case 9:
	                        numAsWords += "Nine ";
	                        break;
	                    
	                    case 8:
	                        numAsWords += "Eight ";
	                        break;
	                    case 7:
	                        numAsWords += "Seven ";
	                        break;
	                    case 6:
	                        numAsWords += "Six ";
	                        break;
	                    case 5:
	                        numAsWords += "Five ";
	                        break;
	                    case 4:
	                        numAsWords += "Four ";
	                        break;
	                    case 3:
	                        numAsWords += "Three ";
	                        break;
	                    case 2:
	                        numAsWords += "Two ";
	                        break;
	                    case 1:
	                        numAsWords += "One ";
	                        break;
	                    default:
	                        numAsWords += "Zero ";
	                        break;
	                }
	            }
	            
	            // here we're dealing with those trailing
	            // zeroes mentioned above
	            while (getDigitCount(reversed) < digits) {
	                numAsWords += "Zero ";
	                reversed *= 10;
	            }
	            
	            
	        }
	    System.out.println(numAsWords);    
	    }
	    
	    /***************************************
	     * 
	     * @param num (int)
	     * @return num in reverse
	     **************************************/
	    public static int reverse(int num) {
	        
	        int reversed= 0;
	        // this warning saves me an
	        // if statement later on
	        @SuppressWarnings("unused")
			int multiplier = 0;
	        // this can handle negative
	        // nums
	        while (Math.abs(num) > 0) {
	            reversed *= 10;
	            reversed += (num % 10);
	            num /= 10;
	            multiplier++;
	        }
	        return reversed;
	    }
	    
	    /********************************************
	     * 
	     * @param num
	     * @return number of digits
	     * 
	     ********************************************/
	    public static int getDigitCount(int num) {
	        if (num < 0) {
	            return -1;
	        }
	        
	        int digits = 1;
	        int power = 1;
	        
	        while(num >= Math.pow(10, power)) {
	        	digits++;
	        	power++;
	        }
	        return digits;
	    }
}
