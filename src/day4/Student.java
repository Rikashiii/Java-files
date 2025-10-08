package day4;

public class Student implements SaveToFile, SaveToDB{

	private int rollno;
	private String name;
	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	@Override
	public void saveToDB() {
		System.out.println("Writting data to file");
		
	}
	@Override
	public void saveToFile() {
		System.out.println("Writting data to DB");
		
	}
	
	
}
