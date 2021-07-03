package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		Collection<Integer> values=new ArrayList<>();//does not have any indexing.
		values.add(1);//all are stored as object.
		values.add(2);
		values.add(3);

		System.out.println(values);
		
		Iterator<Integer> itr=values.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
			}
		
		List<Integer> value=new ArrayList<>();//Supports indexing.
		value.add(1);
		value.add(2);
		value.add(3);
		
        
		System.out.println(value);
		for(int i=0;i<value.size();i++){
			System.out.println(value.get(i));
		}
		
		for(int k:value){
			System.out.println(k);
		}
	
	}
}
