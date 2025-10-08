package day5;

public class Student implements Printable, Writable{

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
	public void write() {
		System.out.println("Writting");
		
	}
	@Override
	public void print() {
		System.out.println("Printing");
		
	}
	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void test() {
		Printable.super.test();
	}
	

	
}
