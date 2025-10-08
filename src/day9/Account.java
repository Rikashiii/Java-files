package day9;

import java.io.Serializable;

public class Account implements Serializable{
	private static final long serialVersionUID = 1L;
	private transient int accno;
	private String name;
	private double balance;
	
	
	public Account(int accno, String name, double balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [account id=" + accno + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	
}
