package day1;

public class Bank {

	public static void main(String[] args) {
		
		Account acc1 = new Account("aaa", 4464960, 50000);
		//instance method obj.method()
		acc1.calculateInterest();
		
		//static Class.method
		Account.displayRate();

	}

}
