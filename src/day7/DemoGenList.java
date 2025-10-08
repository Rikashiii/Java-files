package day7;

import java.util.ArrayList;
import java.util.List;

public class DemoGenList {

	public static void main(String[] args) {
		List<Integer>  lst = new ArrayList<>();
		lst.add(100);
		lst.add(101);
		lst.add(102);

		for(Integer i : lst)
		{
			System.out.println(i);
		}

		Integer obj = lst.get(2);
	}

}
