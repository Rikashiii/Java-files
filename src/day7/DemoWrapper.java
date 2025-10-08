package day7;

public class DemoWrapper {

	public static void main(String[] args) {
		// primitive to wrapper
		int i = 10;
		Integer j = Integer.valueOf(i);
		System.out.println(j);
		
		
		//wrapper to primi
		int k = j.intValue();
		System.out.println(k);
		
		//auto - boxing
		int a = 20;
		Integer b = a;
		
		//auto - unboxing
		int c = b;
		
		//Parsing
		String s = "30";
		int x = Integer.parseInt(s);
		
		Integer y = Integer.valueOf(s);
		


	}

}
