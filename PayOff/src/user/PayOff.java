package user;

public class PayOff {
	
	public static int calculateMonthsToPayOff(int principal, double apr, int avgPayment) {
		int months = 0;
		double monthlyInterest = apr/12;
		double monthlyFee; 
		while(principal > 0) {
			principal = principal - avgPayment;
			monthlyFee = principal * monthlyInterest;
			principal = principal - (int) monthlyFee;
			months++;
		}
		
		return months;
	}
	
	public static void main (String[] args) {
		System.out.println(calculateMonthsToPayOff(5500,0.1699,300));
	}
}
