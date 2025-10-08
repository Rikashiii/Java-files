package day7;

public class DemoGeneric <T>{
	
	T obj;
	
	public DemoGeneric(T obj)
	{
		this.obj = obj;
	}
	
	public String getType()
	{
		return obj.getClass().getName();
	}

	public static void main(String[] args) {
		DemoGeneric<Integer> iobj = new DemoGeneric<Integer>(100);
		System.out.println(iobj.getType());
		DemoGeneric<String> sobj = new DemoGeneric<String>("hello");
		System.out.println(sobj.getType());
	}
}
