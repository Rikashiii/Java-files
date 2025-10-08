package day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoListMethods {

	public static void main(String[] args) {
		List<Integer>  lst = new ArrayList<>();
		lst.add(500);
		lst.add(401);
		lst.add(602);
		lst.add(702);
		lst.add(302);

		for(Integer i : lst)
		{
			System.out.println(i);
		}

		Collections.sort(lst);
		System.out.println(lst);
		
		int index = Collections.binarySearch(lst, 602);
		if (index >= 0)
			System.out.println("Data found at " + index);
		
		System.out.println("Min " + Collections.min(lst));
		System.out.println("Max " + Collections.max(lst));
		
		Collections.reverse(lst);
		System.out.println(lst);
		Collections.shuffle(lst);
		System.out.println(lst);	
		

	}

}
