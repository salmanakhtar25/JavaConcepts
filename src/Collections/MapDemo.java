package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();//Hashmap is not thread safe use hashtable for 
		                                       //thread safety.
		map.put("myName", "salman");
		map.put("actor", "john");
		map.put("ceo", "Rajiv");
		map.put("actor", "Akshay");//replaces the value in actor key.
		
		Set<String> keys=map.keySet();
		
		System.out.println(map);
		
		for(String key:keys){
			System.out.println(key+" " +map.get(key));
		}
	}

}
