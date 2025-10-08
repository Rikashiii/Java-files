package day7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList {

	public static void main(String[] args) {
		
		List<Object>  lst = new ArrayList<>();
		lst.add(100);
		lst.add(45.5f);
		lst.add(true);
		lst.add("java");
		lst.add(456.89);
		lst.add(100);
		
		System.out.println(lst);
		
		lst.remove("java");
		System.out.println(lst);
		
		Object obj = lst.get(3);
		String s = (String)obj;
		s.toUpperCase();
		
		System.out.println("----------------------");
		for(int i =0; i< lst.size();i++)
		{
			System.out.println(lst.get(i));
		}
		
		System.out.println("----------------------");
		for(Object o : lst)
		{
			System.out.println(o);
		}
		
		System.out.println("----------------------");
		Iterator it = lst.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
