package Hashmap;

import java.util.HashMap;
import java.util.Set;

public class firstProgram {

	public static void main(String[] args) {
		HashMap<Integer,String> mp= new HashMap<Integer, String>();
		mp.put(1, "ashwini");
		mp.put(2, "kittu");
		mp.put(3, "sagar");
		//System.out.println(mp.values());
		
		//mp.remove(2);
		
		mp.replace(2,"mahajan");
		Set<Integer> keys = mp.keySet();
       System.out.println(keys);
       for(Integer k:keys)
       {
    	   System.out.println(k+":"+mp.get(k));
       }
      
	}

}
