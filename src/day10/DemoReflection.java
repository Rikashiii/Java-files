package day10;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class DemoReflection {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, 
	InvocationTargetException {
		Car car = new Car();		
		Class c = car.getClass();
		
		Field [] fields = c.getDeclaredFields();
		for(Field f : fields)
		{
			System.out.println(f.getName());
			System.out.println(f.getType());
			if(f.getName().equals("regno"))
			{
				f.setAccessible(true);
				f.setInt(car, 1000);
			}
			if(f.getName().equals("model"))
			{
				f.setAccessible(true);
				f.set(car, "City");
			}
		}
		System.out.println(car);
		System.out.println("-------------------------");
		Method [] methods = c.getDeclaredMethods();
		for(Method m : methods)
		{
			System.out.println(m.getName());
			if(m.getName().equals("privateMethod"))
			{
				Parameter [] params = m.getParameters();
				System.out.println(Arrays.toString(params));
				m.setAccessible(true);
				m.invoke(car);
			}
			if(m.getName().equals("staticMethod"))
			{
				Parameter [] params = m.getParameters();
				System.out.println(Arrays.toString(params));
				m.setAccessible(true);
				m.invoke(null);
			}
			if(m.getName().equals("setValues"))
			{
				Parameter [] params = m.getParameters();
				System.out.println(Arrays.toString(params));
				m.setAccessible(true);
				m.invoke(car, 66788, "xyz");
			}
		}
		System.out.println(car);

	}

}
