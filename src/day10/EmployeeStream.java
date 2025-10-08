package day10;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeStream {

	public static void main(String[] args) {
		List<Employee> emplist = EmployeeCollection.getEmployeeData();
		Stream<Employee> stream = emplist.stream();
		
		System.out.println("-----Sort by Employee id------------");
		stream.sorted().forEach(System.out::println);		
		
		System.out.println("-----Sort by Employee name------------");
		stream = emplist.stream();
		Comparator<Employee> byname = Comparator.comparing(Employee::getName);
		stream.sorted(byname).forEach(System.out::println);
		
		System.out.println("-----Sort by Employee name within Dept------------");
		Comparator<Employee> bydept = Comparator.comparing(Employee::getDepartment);
		Comparator<Employee> bydeptname = bydept.thenComparing(byname);
		stream = emplist.stream();
		stream.sorted(bydeptname).forEach(System.out::println);
		
		System.out.println("-----Filter By sal range------------");
		stream = emplist.stream();
		Predicate<Employee> salrange = (emp) -> emp.getSalary() >50000 &&
				emp.getSalary() <80000;
		stream.filter(salrange).forEach(System.out::println);
		
		System.out.println("-----Filter By skill------------");
		stream = emplist.stream();
		stream.filter((emp) -> emp.getSkills().contains("Java"))
		.forEach((emp) -> System.out.println(emp));
		
		System.out.println("-----Group by Dept------------");
		stream = emplist.stream();
		Map<String, List<Employee>> empsbydept= stream.collect(Collectors.groupingBy(Employee::getDepartment));
		empsbydept.forEach((k,v) -> System.out.println(k + "-----" + v));
		
		
		System.out.println("-----Dept wise spend-----------");
		stream = emplist.stream();
		Map<String, Double> salspend= stream.collect(Collectors.groupingBy(Employee::getDepartment, 
				Collectors.summingDouble(Employee::getSalary)));
		
		salspend.forEach((k,v) -> System.out.println("For " + k + " Total spend is :" + v ));
		
		System.out.println("-----Min/Max/Ave Salary---------");
		stream = emplist.stream();
		Optional<Employee> min= stream.min(Comparator.comparing(Employee::getSalary));
		if(min.isPresent())
			System.out.println(min.get());
		
		stream = emplist.stream();
		Optional<Employee> max= stream.max(Comparator.comparing(Employee::getSalary));
		if(max.isPresent())
			System.out.println(max.get());
		
		stream = emplist.stream();
		OptionalDouble ave= stream.mapToDouble(Employee::getSalary).average();
		if(ave.isPresent())
			System.out.println(ave.getAsDouble());
		
	}

}
