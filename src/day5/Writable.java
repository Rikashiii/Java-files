package day5;

public interface Writable {

	void write();
	
	void abstractMethod();
	
	default void test()
	{
		System.out.println("Default behaviour of Writable");
	}
}
