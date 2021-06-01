package wordCount;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class WordCount {

	public static void main(String[] args) throws IOException {
		try {
		InputStream file = new FileInputStream("C:\\Path\\To\\Large\\File.txt");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(file));
		int count = 0;
		
		while (true) {
			String line = bufferedReader.readLine();
			if (line != null) {
				// System.out.println(line);
				count += (line.split(" ")).length;
			} else {
				break;
			}
		}
		try {
			bufferedReader.close();
		} catch (IOException e) {
			System.out.println("The buffered reader could not close.");
		}
		
		System.out.println("Total word count: " + count);
		} catch (FileNotFoundException e) {
			System.out.println("The specified file was not found.");
		}

	}

}
