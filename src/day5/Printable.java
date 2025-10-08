package day5;

public interface Printable {

	void print();
	void abstractMethod();
	default void test()
	{
		System.out.println("Default behaviour of Printable");
	}
}
