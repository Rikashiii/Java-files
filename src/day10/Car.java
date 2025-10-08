package day10;

public class Car {
	private int regno;
	private String model;
	
	public Car()
	{
		
	}
	public Car(int regno, String model) {
		this.regno = regno;
		this.model = model;
	}
	private void privateMethod()
	{
		System.out.println("This is a private Method");
	}
	
	public static void staticMethod()
	{
		System.out.println("This is a static method");
	}
	
	public void setValues(int regno, String model)
	{
		this.regno = regno;
		this.model = model;
		System.out.println("Values set");
	}
	
	@Override
	public String toString() {
		return "Car [regno=" + regno + ", model=" + model + "]";
	}
	
	
	
	
}
