package day5;

public class NewDate {

	private int day;
	private String month;
	private int year;
	
	public NewDate(int day, String month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public boolean equals(Object o)
	{
		//Down-Casting, required to
		//access Date fields : day, month, year
		NewDate dt = (NewDate) o; 
		if(this.day==dt.day && this.month.equals(dt.month) &&
		this.year == dt.year)
		{
			return true;
		}
		else
			return false;		
	}
	
	@Override
	public int hashCode()
	{
		int prime = 13;
		return prime *( this.day + month.hashCode() + this.year);
	}
	@Override
	public String toString() {
		return "day=" + day + ", month=" + month + ", year=" + year ;
	}
	
	
	 
	
	
}
