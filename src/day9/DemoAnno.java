package day9;

public class DemoAnno {

	public static void main(String[] args) {
		
		Printable p = new Printable() {
			
			@Override
			public void print() {
				System.out.println("This is inner class");
				
			}
		};

	}

}
