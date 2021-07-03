package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set<Integer> values=new HashSet<>();//does not maintain sequence
		values.add(2);
		values.add(5);
		values.add(6);
		values.add(2);//does not allow duplicates
		
		for(int k:values){
			System.out.println(k);
		}
	}

}
