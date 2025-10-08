package day9;

public class Math {

	public static boolean isprime(int n)
	{
		for(int i =2;i<n;i++)
		{
			if (n % i==0)
				return false;
		}
		return true;
	}
}
