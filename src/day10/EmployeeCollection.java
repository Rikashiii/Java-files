package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class EmployeeCollection {
	
	public static List<Employee> getEmployeeData()
	{
		List<Employee> emplist = new ArrayList<>();
		Set<String> skills1 = new TreeSet<>();
		skills1.add("Java");
		skills1.add("python");
		Employee e1= new Employee(321, "aaa", 50000, "IT", skills1);
		emplist.add(e1);
		Set<String> skills2 = new TreeSet<>();
		skills2.add("C++");
		skills2.add("Python");
		emplist.add(new Employee(121, "sss", 40000, "IT", skills2));
		Set<String> skills3 = new TreeSet<>();
		skills3.add("Java");
		skills3.add("Javascript");
		emplist.add(new Employee(421, "ppp", 60000, "IT", skills3));
		Set<String> skills4 = new TreeSet<>();
		skills4.add("MS Projects");
		skills4.add("Jira");
		emplist.add(new Employee(221, "mmm", 75000, "Projects", skills4));
		Set<String> skills5 = new TreeSet<>();
		skills5.add("Jira");
		skills5.add("PMP");
		emplist.add(new Employee(521, "nnn", 60000, "Projects", skills5));
		return emplist;
	}
	
	

}
