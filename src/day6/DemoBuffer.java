package day6;

public class DemoBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb);
		
		sb = sb.append(" 11");
		System.out.println(sb);  //Same object is modified

	}

}
