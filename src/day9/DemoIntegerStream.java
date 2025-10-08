package day9;

import java.util.List;
import java.util.stream.Stream;

public class DemoIntegerStream {

	public static void main(String[] args) {
		List<Integer> ilist = List.of(7,10,4,21,13,18,23,24,15,2,17,7,10,4,21,13,50,100,98,80,70,60);
		
		//collection obj.stream()
		Stream<Integer> stream= ilist.stream();

	}

}
