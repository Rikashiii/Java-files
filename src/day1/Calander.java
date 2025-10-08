package day1;

public class Calander {

	public static void main(String[] args) {
		int i =3;
		Date d = new Date();
//		d = null;
		//
		d.setDate(8, "Sept", 2025);
		Date d1 = new Date();
		d1.setDate(8, "Sept", 2025);
		d1.displayDate();
		
		System.out.println("--------------------");
		Date1 dd = new Date1();
		System.out.println(i);
		System.out.println(dd);
	}

}
