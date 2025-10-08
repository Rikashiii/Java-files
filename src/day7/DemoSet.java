package day7;

import java.util.HashSet;
import java.util.Iterator;

public class DemoSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("one");
		
		System.out.println(set);
		
		set.remove("one");
		System.out.println(set);
		
		boolean ispresent =set.contains("five");
		System.out.println(ispresent);
		
		for(String s : set)
		{
			System.out.println(s.toUpperCase());
		}
		System.out.println("-------------------------");
		Iterator<String> it = set.iterator();
		while(it.hasNext())
			System.out.println(it.next());

	}

}
