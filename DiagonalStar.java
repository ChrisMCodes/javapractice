/*
 *
 * Just a bit of fun drawing diagonal *s in a box
 *
 */

public class DiagonalStar {
    public static void printSquareStar(int number) {
        final int INITIAL_NUMBER_OF_STARS = 4;
        final int ZERO = 0;
        final int ONE = 1;
        final int FIVE = 5;
        int stars = number;
        int spaces = number - INITIAL_NUMBER_OF_STARS;
        
        if (number < FIVE) {
            System.out.println("Invalid Value");
        } else {
        for (int i = ZERO; i < number; i++) {
            for (int j = ZERO; j < number; j++) {
                if (i == ZERO || i == number - ONE 
                    || j == ZERO || j == number - ONE 
                    || i == j || j == number - i - ONE) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
      }
        
    }
}
