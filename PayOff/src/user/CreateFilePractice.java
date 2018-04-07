package user;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFilePractice  {
	public static void main(String[] args) throws IOException {
		try {
			PrintWriter outputPrint = new PrintWriter("temp.txt");
			FileOutputStream outputFile = new FileOutputStream("temp.dat");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
