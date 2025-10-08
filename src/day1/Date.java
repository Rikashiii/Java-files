package day1;

public class Date {

	private int day;
	private String month;
	private int year;
	
	
	public void setDate(int d, String m, int y)
	{
		day = d;
		month= m;
		year = y;
	}
	
	public void displayDate()
	{
		System.out.println(day + "/" + month + "/" + year);
	}
	
}
