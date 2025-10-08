package day6;

import java.io.File;
import java.io.IOException;

public class Math {
	//Checked
	public static void createFile(File f) throws IOException
	{
		if (!f.exists())
			f.createNewFile();
			
	}
	//Un checked
	public static void divide(String [] nums) throws ArrayIndexOutOfBoundsException,
	NumberFormatException, ArithmeticException
	{
		int dividend = Integer.parseInt(nums[0]);					
		int divisor = Integer.parseInt(nums[1]);			
		int result = dividend/divisor;
		System.out.println(result);
	}
	public static void main(String[] args) {
		try {
			divide(args);
		}
		//multi-catch block
		catch (ArrayIndexOutOfBoundsException | NumberFormatException 
			| ArithmeticException e) {
			System.out.println(e);
		}
		
		try {
			createFile(new File("abc.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
