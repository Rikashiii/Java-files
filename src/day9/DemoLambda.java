package day9;

import java.util.ArrayList;
import java.util.List;

public class DemoLambda {
	
	public static boolean operateOnNumber(TestNumber func, int n)
	{
		return func.test(n);
	}

	public static List<Integer> operateOnNumbers(TestNumber func, List<Integer> nums)
	{
		List<Integer> filtered = new ArrayList<>();
		for(Integer n : nums)
		{
			if (func.test(n))
			{
				filtered.add(n);
			}
		}
		return filtered;
	}
	
	public static void main(String[] args) {
		List<Integer> ilist = List.of(7, 23, 11,12, 14, -10, 9, -98, -76, 76, 55, 44);
		
		boolean ispositive = operateOnNumber((n) -> n>0, -10);
		System.out.println(ispositive);
		
		List<Integer> positives = operateOnNumbers((n) -> n>0 , ilist);
		System.out.println(positives);
		
		List<Integer> even = operateOnNumbers((n) -> n % 2==0 , ilist);
		System.out.println(even);
		
		boolean isprime = operateOnNumber((n) ->
					{
						for(int i =2;i<n;i++)
						{
							if (n % i==0)
								return false;
						}
						return true;
					}
				, 12);
				
			System.out.println(isprime);	
			
			TestNumber primes = (n) ->
			{
				for(int i =2;i<n;i++)
				{
					if (n % i==0)
						return false;
				}
				return true;
			};
			
			List<Integer> primenos = operateOnNumbers(primes, ilist);
			System.out.println(primenos);
			
			//Method reference
			primenos = operateOnNumbers(Math::isprime, ilist);
			System.out.println(primenos);
		
	}

}
