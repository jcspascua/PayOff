package user;

/*
 * To calculate the interest on your account each month, American Express multiplies 
 * the Daily Periodic Rate by the number of days in the billing cycle, and then multiplies 
 * that total by the average of your daily balances. 
 * (The Daily Periodic Rate is determined by dividing your account's APR by 365.)
 */


public class AmericanExpressCard extends Cards {
	private double dailyPeriodicRate = bankAPR/365;
	private int daysInMonth;
	private double averageDailyBalance;
 
}
