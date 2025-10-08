package day5;

public class TestObjects {

	public static void main(String[] args) {
		NewDate d1 = new NewDate(12, "Sept", 2025);
		NewDate d2 = new NewDate(12, "Sept", 2025);
		
		if(d1.equals(d2))
			System.out.println("Object are equal");
		else
			System.out.println("Object are not equal");
		
		System.out.println(d1.hashCode());
		System.out.println(d1.hashCode());

	}

}
