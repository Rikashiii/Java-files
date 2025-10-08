package day1;

public class Account {

	private String name;
	private int accid;
	private double balance;
	
	private static float intrate;
	
	static {
		intrate= 6.5f;
	}
	
	public Account(String name, int accid, double balance)
	{
		this.name = name;
		this.accid = accid;
		this.balance = balance;
	}
	
	public void calculateInterest()
	{
		System.out.println("Interest Earned :" + (balance * intrate)/4);
	}
	
	public static void displayRate()
	{
		System.out.println("Current interest rate :" + intrate);
	}
	
	public String toString()
	{
		return "Account Name : " + name + " Id" + accid + " Balance :" + balance;
	}
}
