package day5;

public class Manager extends SalariedEmployee{

	protected double allowance;
	
	public Manager(int empid, String name, double basic, double allownace)
	{
		super(empid, name, basic);
		this.allowance = allownace;
	}
	
	@Override
	public double calculateGross() {
//		double hra = basic * 0.4;
//		double da = basic * 0.15;
//		return basic + hra+da + allowance;
		return super.calculateGross() + allowance;
	}
	
	@Override
	public void computeTax()
	{
		System.out.println("In manager");
	}
}
