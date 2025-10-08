package day6;

public class DemoExceptions {

	public static void main(String[] args) {
		try {
			int dividend = Integer.parseInt(args[0]);					
			int divisor = Integer.parseInt(args[1]);			
			int result = dividend/divisor;
			System.out.println(result);
		}
	
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch (ArithmeticException e) {
//			e.printStackTrace();
//			System.out.println(e);

			System.out.println("Program could not use due to " + e.getMessage());
			System.out.println("Divisor can not be zero");
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println(e); //catches any un-caught exceptions
		}

	}

}
