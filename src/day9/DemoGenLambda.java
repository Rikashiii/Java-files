package day9;

import java.util.ArrayList;
import java.util.List;

public class DemoGenLambda {

	public static <T> boolean operateOnObject(TestObjects<T> func, T obj)
	{
		return func.test(obj);
	}
	
	public static <T> List<T> operateOnObjects(TestObjects<T> func, List<T> obj)
	{
		List<T> filtered = new ArrayList<>();
		for(T o : obj)
		{
			if(func.test(o))
				filtered.add(o);
		}
		return filtered;
	}
	
	
	public static void main(String[] args) {
		List<Integer> ilist = List.of(7, 23, 11,12, 14, -10, 9, -98, -76, 76, 55, 44);
		List<String> colors = List.of("red", "yellow", "pink", "white", "blue", "black");
		
		boolean issub = operateOnObject((s) -> s.contains("lambda"), "java is powerful");
		System.out.println(issub);
		
		List<Integer> greterthanten = operateOnObjects((n) -> n>10, ilist);
		System.out.println(greterthanten);
		
		List<String> shortstrings = operateOnObjects((s) -> s.length()<5, colors);
		System.out.println(shortstrings);
	}
}
