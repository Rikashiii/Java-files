package day4;

import day3.Employee;
import day3.SalariedEmployee;

public class User {

	public static void main(String[] args) {
		SalariedEmployee se = new SalariedEmployee(423, "aa", 60000);
		Payroll.displayGross(se);
		Payroll.displayNet(se);
		
		//Up -casting (implicit)
		/*
		 * Super class ref is used to refer to sub class object
		 */
		/*
		 * Here the static ref is Employee (super)
		 * Dynamic ref is SalariedEmployee (sub)
		 */
		Employee e = new SalariedEmployee(423, "aa", 60000);
		System.out.println(e.calculateGross());
		
		/*
		 * TO access specific fields and methods of the sub class
		 * the object must be down-casted
		 */
		SalariedEmployee ss = (SalariedEmployee)e;
		ss.calculateNet(); //defined in Salaried Employee not in Employee
		System.out.println(ss.calculateNet());
		
		

	}

}
