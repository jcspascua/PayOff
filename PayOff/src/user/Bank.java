package user;

import java.util.Scanner;

public class Bank {
	private String bankName = "";
	private double bankBalance = 0;
	private double bankAPR = 0;
	private static java.util.Scanner input;
	
	//constructor, three parameter for Bank object
	public Bank () 
	{
		this.bankName = bankName;
		this.bankBalance = bankBalance; 
		this.bankAPR = bankAPR;
	}
	
	//constructor, three parameter for Bank object
	public Bank (String bankName, double bankBalance, double bankAPR) 
	{
		this.bankName = bankName;
		this.bankBalance = bankBalance; 
		this.bankAPR = bankAPR;
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
	
		
	public static void main(String[] args) {
//		// Testing
//		Bank chase = new Bank("Chase", 6000, 0.1699);
//		System.out.println(chase.getBankName());
//		System.out.println(chase.getBankBalance());
//		System.out.println(chase.getBankAPR());		
		Bank bank = new Bank();
		
		//Prompt for bank name
		System.out.print("Enter bank name: ");
		input = new Scanner(System.in);
		String bankName = input.nextLine();
		System.out.println(bankName);
		bank.setBankName(bankName);
		
		//Prompt for bank balance
		System.out.print("Enter bank balance: ");
		String bankBalance = input.nextLine();
		int bankBalanceInt = Integer.parseInt(bankBalance);
		System.out.println(bankBalanceInt);
		bank.setBankBalance((double) bankBalanceInt);
		
		//Prompt for bank APR
		System.out.print("Enter bank APR: ");
		String bankAPR = input.nextLine();
		double bankAPRDouble = Double.parseDouble(bankAPR);
		System.out.println(bankAPRDouble);
		bank.setBankAPR(bankAPRDouble);

	}

}
