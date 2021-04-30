import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class GetData {

    public static void main(String[] args) {

        File file = new File("data.txt");
	try {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
	        System.out.println(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
	    System.out.println("Sorry, the file was not found.");
            System.exit(-1);
        }

    }
}