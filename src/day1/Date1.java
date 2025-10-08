package day1;

public class Date1 {

	private int day;
	private String month;
	private int year;

	//Constructor - Initialize data members
	public Date1()
	{
		this(1, "Jan", 1990);
	}
	public Date1(int day, String month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void setDay(int day)
	{
		this.day = day;
	}
	
	public int getDay()
	{
		return day;
	}
	
	//toString - print object
	public String toString()
	{
		return day + "/" + month + "/" + year;
	}
	
	
}
