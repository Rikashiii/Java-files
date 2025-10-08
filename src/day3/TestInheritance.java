package day3;

public class TestInheritance {

	public static void main(String[] args) {
		Base base = new Base();
		base.test();
		
		int id = base.getID();
		System.out.println(id);
		
		Extended1 ex1 = new Extended1();
		ex1.test();
		
		System.out.println(ex1.id);

	}

}
