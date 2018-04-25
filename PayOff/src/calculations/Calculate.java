package calculations;

public class Calculate {
	private static double totalBalance = 0;
	private static int count = 0;
	private static double monthlyPayment = 500;

	public static void main(String[] args) {
		double balance1 = 10000;
		double balance2 = 202;
		double apr1 = 16;
		double apr2 = 20;
		double mapr1 = apr1/12/100;
		double mapr2 = apr2/12/100;
		totalBalance = balance1 + balance2; 
		while (totalBalance >= 0 ) {
			totalBalance += balance1 * mapr1 + balance2 * mapr2 - monthlyPayment;
			count++;
		}
		System.out.println("It will take you " + count + " months to pay off your credit card debt.");
		System.out.println("It will take you " + count/12 + " years and " + count%12 + " months to pay off your credit card debt.");
	}
}
