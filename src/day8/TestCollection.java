package day8;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class TestCollection {

public static void main(String[] args) {
		
		List<Employee> emplist= EmployeeCollection.getEmployeeData();
		EmployeeCollection.printList(emplist);
		System.out.println("-----After removing en employee----");
		Set<String> skills4 = new TreeSet<>();
		skills4.add("MS Projects");
		skills4.add("Jira");
		Employee e = new Employee(221, "mmm", 75000, "Projects", skills4);
		EmployeeCollection.removeEmployee(emplist, e);
		EmployeeCollection.printList(emplist);
		
		System.out.println("------Sort by Employee id--------");		
		Collections.sort(emplist);
		EmployeeCollection.printList(emplist);
		System.out.println("------Search by Employee id--------");	
		int found = Collections.binarySearch(emplist, 
				new Employee(421, null, 0, null, null));
		System.out.println("Data found at : "+ found);
		
		System.out.println("------Sort by Employee name--------");
		Collections.sort(emplist, new NameComparator());
		EmployeeCollection.printList(emplist);
		
		System.out.println("------Sort by Employee salary--------");
		Collections.sort(emplist, new SalComparator());
		EmployeeCollection.printList(emplist);
		
		System.out.println("-----------min/max salary-------------");
		System.out.println(Collections.min(emplist, new SalComparator()));
		System.out.println(Collections.max(emplist, new SalComparator()));
		
		System.out.println("-----------Filter by Department-------");
		List<Employee> filtered = EmployeeCollection.filterByDept(emplist, "IT");
		EmployeeCollection.printList(filtered);		
		
		System.out.println("-----------Filter by skill-------");
		List<Employee> filtered1 = EmployeeCollection.filterBySkill(emplist, "Java");
		EmployeeCollection.printList(filtered1);
		
		System.out.println("---------Map Of Salary------------");
		Map<String, Double> salmap = EmployeeCollection.mapBySal(emplist);
		for(Entry<String, Double> entry : salmap.entrySet())
		{
			System.out.println(entry.getKey() + "---"+ entry.getValue());
		}
	}
}
