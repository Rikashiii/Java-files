package day8;

import java.util.Objects;
import java.util.Set;

public class Employee  implements Comparable<Employee>{	
	private int empid;
	private String name;
	private double salary;
	private String department;
	private Set<String> skills;
	public Employee(int empid, String name, double salary, String department, Set<String> skills) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.skills = skills;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Set<String> getSkills() {
		return skills;
	}
	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(department, empid, name, salary, skills);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(department, other.department) && empid == other.empid && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary)
				&& Objects.equals(skills, other.skills);
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ ", skills=" + skills + "]";
	}
	@Override
	public int compareTo(Employee o) {
		return this.empid - o.empid;

	}
	
	
	

	
}
