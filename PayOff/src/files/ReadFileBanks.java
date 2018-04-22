package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadFileBanks extends ReadFile {
	private static Scanner input;

	public static void main(String[] args) throws FileNotFoundException{
		String fileName = "";
		Path path = Paths.get(fileName);
		File file = path.toFile();
		input = new Scanner(file);
		input = input.useDelimiter(";");
		while (input.hasNext()) {
			String text = input.next().trim();
			System.out.println(text);
		}
	}// close main method
}
