package day5;
public class TestInterface {

	public static void main(String[] args) {
		SalariedEmployee se = new SalariedEmployee(354, "aaa", 80000);
		se.computeTax();
		
		Manager me = new Manager(342, "bbb", 90000, 12000);
		me.computeTax();
	}

}
