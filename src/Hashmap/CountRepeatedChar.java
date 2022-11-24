package Hashmap;

import java.util.HashMap;
import java.util.Set;

public class CountRepeatedChar {

	public static void main(String[] args) 
	{
		
		String s="abbcssc";
		HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
		for(int i=0;i<=s.length()-1;i++)
		{
			char value=s.charAt(i);
			if(mp.containsKey(value))
			{
				mp.put(value,mp.get(value)+1);
			}
			else
			{
			mp.put(value,1);	
			}
		}
		Set<Character> keys = mp.keySet();//it will return all character from hashmap which is unique 
	    for(Character key:keys)
	    {
	    	System.out.println(key+":"+mp.get(key));
	    }
	  
	    for(Character key:keys)
	    {
	    	if(mp.get(key)>1)
	    	{
	    	System.out.println("dublicate key"+key+":"+mp.get(key));
	    	}
	    }
	    
	}

		
}
