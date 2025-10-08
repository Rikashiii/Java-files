package day6;

public class StringMethods {

	public static void main(String[] args) {
		String greetings = "hi,hello,good morning";
		
		String [] arr = greetings.split(",");
		for(String a : arr)
		{
			System.out.println(a);
		}
		
		String greeting = String.join("-",arr);
		System.out.println(greeting);
		
		boolean ispresent = greetings.contains("hello");
		System.out.println(ispresent);
		
		String sub = greetings.substring(2, 10);
		System.out.println(sub);
		
		
		
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		
		
		String s3 = s1.intern();
		String s4 = s1.intern();
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
	}
}
