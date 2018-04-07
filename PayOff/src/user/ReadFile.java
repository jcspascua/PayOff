package user;

import java.util.Scanner;

public class ReadFile{
	private static java.util.Scanner input;

	public static void main(String[] args) throws Exception {
		//create a file instance
		java.io.File file = new java.io.File("BANK.txt");
		input = new Scanner(file);
		String bank = input.next();
		String bankBalance = input.next();
		String bankAPR = input.next();
		String bankDescription = input.next();
		System.out.println("The bank is " + bank + ". " + "Your balance is: $" + 
				bankBalance + " with an APR of " + bankAPR + "." 
				+ " You can describe this bank as " + bankDescription + ".");
		input.close();
	}

}
