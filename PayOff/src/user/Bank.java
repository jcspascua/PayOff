package user;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Bank {
	private String bankName = "";
	private double bankBalance = 0;
	private double bankAPR = 0;
	private String bankDescription = "";
	private static java.util.Scanner input;
	private java.io.PrintWriter output;
	
	//constructor, no parameter for Bank object
	public Bank() {
		
	}
	
	//constructor, three parameter for Bank object
	public Bank(String bankName, double bankBalance, double bankAPR, String bankDescription) 
	{
		this.bankName = bankName;
		this.bankBalance = bankBalance; 
		this.bankAPR = bankAPR;
		this.bankDescription = bankDescription;
	}
	
	//setter methods
	public void setBankName(String bankName) 
	{
		this.bankName = bankName;
	}
	public void setBankBalance(double bankBalance) 
	{
		this.bankBalance = bankBalance;
	}
	public void setBankAPR(double bankAPR) 
	{
		this.bankAPR = bankAPR;
	}
	public void setBankDescription(String bankDescription) 
	{
		this.bankDescription = bankDescription;
	}
	
	//getter methods
	public String getBankName() 
	{
		return this.bankName;
	}
	public double getBankBalance() 
	{
		return this.bankBalance;
	}
	public double getBankAPR() 
	{
		return this.bankAPR;
	}
	public String getBankDescription() 
	{
		return this.bankDescription;
	}
	
	//write file
	
	public void writeFile(Bank bank) throws IOException {
		File file = new File(this.bankName + ".txt");
		file.createNewFile();
		output = new java.io.PrintWriter(file);
		output.println(this.bankName);
		output.println(this.bankBalance);
		output.println(this.bankAPR);
		output.println(this.bankDescription);
		output.close(); //always required
	}
			
	public static void main(String[] args) throws IOException {
		Bank bank = new Bank();
		//Prompt for bank name
		System.out.print("Enter bank name: ");
		input = new Scanner(System.in);
		String bankName = input.nextLine();
		bank.setBankName(bankName);
		System.out.println(bankName);

		
		//Prompt for bank balance
		System.out.print("Enter bank balance: ");
		String bankBalance = input.nextLine();
		int bankBalanceInt = Integer.parseInt(bankBalance);
		bank.setBankBalance((double) bankBalanceInt);
		System.out.println(bankBalance);
		
		//Prompt for bank APR
		System.out.print("Enter bank APR: ");
		String bankAPR = input.nextLine();
		double bankAPRDouble = Double.parseDouble(bankAPR);
		System.out.println(bankAPRDouble);
		bank.setBankAPR(bankAPRDouble);

		//Prompt for bank Description
		System.out.print("Enter bank Description: ");
		String bankDescription = input.nextLine();
		System.out.println(bankDescription);
		bank.setBankDescription(bankDescription);
		
		System.out.println(bank.bankName);
		System.out.println(bank.bankBalance);
		System.out.println(bank.bankAPR);
		System.out.println(bank.bankDescription);

		bank.writeFile(bank);
	}

}
