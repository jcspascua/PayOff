package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadFilePractice {
	public static void main(String[] args) throws FileNotFoundException {
		Path path = Paths.get("User-Alana Koffman.txt");
		System.out.println("----- Path Practice -----");
		System.out.format("toString: %s%n", path.toString());
		System.out.format("getFileName: %s%n", path.getFileName());
		System.out.format("getName(0): %s%n", path.getName(0));
		System.out.format("getNameCount: %d%n", path.getNameCount());
//		System.out.format("subpath(0,2): %s%n", path.subpath(0,2)); //this does not work
		System.out.format("getParent: %s%n", path.getParent()); //this works
		System.out.format("getRoot: %s%n", path.getRoot()); //this works but root is /
		
		System.out.println("----- File Practice -----");

		File file = path.toFile();
		
//		try {
//			file.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		System.out.println("Does it exist? " + file.exists());
		System.out.println("The file has " + file.length() + " bytes");
		System.out.println("Can it be read? " + file.canRead());
		System.out.println("Can it be written? " + file.canWrite());
		System.out.println("Is it a directory? " + file.isDirectory());
		System.out.println("Is it a file? " + file.isFile());
		System.out.println("Is it absolute? " + file.isAbsolute());
		System.out.println("Is it hidden? " + file.isHidden());
		System.out.println("Absolute path is " + file.getAbsolutePath());
		System.out.println("Last modified on " + new java.util.Date(file.lastModified()));
		
		Scanner input = new Scanner(file).useDelimiter(";");
		while (input.hasNext()) {
			String text = input.next().trim();
			System.out.println(text);
		}

	}
}
