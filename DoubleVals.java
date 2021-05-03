import java.util.Scanner;
import java.io.*;

public class DoubleVals {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(new File("C:\\Users\\Owner\\Desktop\\stuff.csv"));
			FileWriter writer = new FileWriter("C:\\Users\\Owner\\Desktop\\doublestuff.csv");
			sc.useDelimiter(",");
			
			while (sc.hasNext()) {
				String currentElement = sc.next();
				if (!currentElement.startsWith("\n") 
						&& !currentElement.startsWith(" ") 
						&& !currentElement.startsWith("\r")) {
					int num = Integer.valueOf(currentElement);
					System.out.println("Num is: " + num);
					int twiceNum = num * 2;
					writer.write(twiceNum + ",");
				} else {
					writer.write("\n");
					currentElement = currentElement.replace("\n", "");
					currentElement = currentElement.replace(" ", "");
					currentElement = currentElement.replace("\r", "");
					int num = Integer.valueOf(currentElement);
					System.out.println("Num is: " + num);
					int twiceNum = num * 2;
					writer.write(twiceNum + ",");
				}
			}
			System.out.println("Success!");
			writer.close();
			sc.close();
		} catch (IOException e) {
			System.out.println("Sorry, an error ocurred");
			e.printStackTrace();
		}
	}

}
