package day3;

public class ContractEmployee extends Employee{
	protected int rate;
	protected int hrs;

	public ContractEmployee(int empid, String name, int rate, int hrs) 
	{
		super(empid, name);
		this.hrs=hrs;
		this.rate=rate;
	}

	@Override
	public double calculateGross() {
		return hrs * rate;
	}

}
