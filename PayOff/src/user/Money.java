package user;

public class Money {
	public static int calculateYears(double principal, double interest,  double tax, double desired) 
	{
		int years = 0;
		double profit;
		double taxFee;
		
		while (principal < desired) {
			profit = principal * interest;
			taxFee = profit * tax;
			principal = principal + profit - taxFee;
			years += 1;
		  }
		  return years;
	  }
	  
	  public static void main(String[] args) {
		  System.out.println(calculateYears(4500,0.00,0.18,1100));
		  
	  }
}