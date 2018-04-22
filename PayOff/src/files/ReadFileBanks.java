package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadFileBanks extends ReadFile {
	private static Scanner input;
	private static String[] stringArray;
	public static void main(String[] args) throws FileNotFoundException{
		stringArray = new String[4];
		String fileName = "Bank of America.txt";
		Path path = Paths.get(fileName);
		File file = path.toFile();
		input = new Scanner(file);
		input = input.useDelimiter("\\n");
		int i = 0;
		while (input.hasNext()) {
			String text = input.next().trim();
			stringArray[i] = text;
			i++;
		}
		System.out.println("The Bank Name is: " + stringArray[0]);
		System.out.println("The Bank Balance is: " + stringArray[1]);
		System.out.println("The Bank Percentage is: " + stringArray[2]);
		System.out.println("The Bank APR: " + stringArray[3]);



	}// close main method
}
