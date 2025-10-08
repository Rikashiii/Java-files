package day6;

public class Book {
	
	private int regno;
	private String title;
	public Book(int regno, String title) {
		this.regno = regno;
		this.title = title;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Book [regno=" + regno + ", title=" + title + "]";
	}
	
	

}
