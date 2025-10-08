package day9;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DemoIntStream {

	public static void main(String[] args) {
		int [] arr = {7,10,4,21,13,18,23,24,15,2,17,7,10,4,21,13,50,100,98,80,70,60};
		
		IntStream istream = Arrays.stream(arr);
		
//		istream.filter((n) -> n % 5 ==0).forEach((n) -> System.out.println(n));
		
		istream.filter((n) -> n%5==0).forEach(System.out::println);
		
		System.out.println("------------------------------");
		istream = Arrays.stream(arr);
		long unique = istream.distinct().count();
		System.out.println(unique);
		
		System.out.println("------------------------------");
		istream = Arrays.stream(arr);
		List<Integer> sorted= istream.distinct().sorted().boxed().collect(Collectors.toList());
		System.out.println(sorted);
		
		System.out.println("------------------------------");
		istream = Arrays.stream(arr);
		List<Integer> squares = istream.distinct().sorted().map((n) -> n * n)
				.boxed().collect(Collectors.toList());
		System.out.println(squares);
		
		System.out.println("------------------------------");
		
		istream = Arrays.stream(arr);
		OptionalInt min= istream.min();
		if (min.isPresent())
		{
			System.out.println(min.getAsInt());
		}
		
		istream = Arrays.stream(arr);
		OptionalInt max= istream.max();
		if (max.isPresent())
		{
			System.out.println(max.getAsInt());
		}
		
		istream = Arrays.stream(arr);
	    OptionalDouble ave= istream.average();
		if (ave.isPresent())
		{
			System.out.println(ave.getAsDouble());
		}
		
		System.out.println("------------------------------");
		
		istream = Arrays.stream(arr);
		OptionalInt total = istream.reduce((n1,n2) -> n1+n2);
		if(total.isPresent())
			System.out.println(total.getAsInt());
	}

}
