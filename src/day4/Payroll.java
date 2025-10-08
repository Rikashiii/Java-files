package day4;

import day3.Employee;
import day3.SalariedEmployee;

public class Payroll {

	public static void displayGross(Employee e)
	{
		System.out.println("Gross salary for the month :" + e.calculateGross());
	}
	
	public static void displayNet(SalariedEmployee e)
	{
		System.out.println("Net Salary for the month :" + e.calculateNet());
	}

}
