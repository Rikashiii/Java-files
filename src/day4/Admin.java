package day4;

import day3.ContractEmployee;
import day3.Employee;
import day3.Manager;
import day3.SalariedEmployee;

public class Admin {

	public static void main(String[] args) {
		Employee [] emps = new Employee[3];
		emps[0] = new SalariedEmployee(12, "sss", 65000);
		emps[1] = new Manager(22, "ppp", 80000, 15000);
		emps[2] = new ContractEmployee(456, "rrr", 500, 80);
		
		for (Employee e :emps)
		{
			Payroll.displayGross(e);
			//instanceof - type comparison operator
			//Checks which type an Object belongs to
			if (e instanceof SalariedEmployee)
			{
				SalariedEmployee se = (SalariedEmployee)e;
				Payroll.displayNet(se);
			}
		}

	}

}
