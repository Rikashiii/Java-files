package day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoMap {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("one", 100);
		map.put("two", 200);
		map.put("three", 300);
		map.put("one", 400);
		
		System.out.println(map);
		
		map.remove("three");
		System.out.println(map);
		
		int value = map.get("two");
		System.out.println(value);
		
		System.out.println("---------------------");
	   Set<String> keys=map.keySet();
	   for(String key : keys)
	   {
		   System.out.println(key + " ---" + map.get(key));
	   }
	   System.out.println("---------------------");
	    Set<Entry<String, Integer>> entries= map.entrySet();
	    for(Entry<String, Integer> entry : entries)
	    {
	    	System.out.println(entry.getKey() + " --" + entry.getValue());
	    }
	   System.out.println(map.containsKey("five"));
	   System.out.println(map.containsValue(400));
	   
	
	}

}
