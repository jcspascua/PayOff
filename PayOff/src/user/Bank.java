package user;

public class Bank {
	private String bankName;
	private double bankBalance;
	private double bankAPR;
	
	//constructor, three parameter for Bank object
	public Bank (String bankName, double bankBalance, double bankAPR) {
		this.bankName = bankName;
		this.bankBalance = bankBalance; 
		this.bankAPR = bankAPR;
	}
	
	//getter methods
	public String getBankName() {
		return this.bankName;
	}
	public double getBankBalance() {
		return this.bankBalance;
	}
	public double getBankAPR() {
		return this.bankAPR;
	}
	
		
	public static void main(String[] args) {
		Bank chase = new Bank("Chase", 6000, 0.1699);
		System.out.println(chase.getBankName());
		System.out.println(chase.getBankBalance());
		System.out.println(chase.getBankAPR());		
	}

}
