package Hashmap;

import java.util.HashMap;
import java.util.Set;

public class practice {

	public static void main(String[] args) {
		String str="abcavc";
		 HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
		for(int i=0;i<=str.length()-1;i++)
		{
		   char value=str.charAt(i);
		   if(mp.containsKey(value))
		   {
		      mp.put(value,mp.get(value)+1);
		    }
		  else
		  {
		     mp.put(value,1);
		  }
		  
		}
		Set<Character> keys=mp.keySet();

		   for(Character key:keys)
		    {
		      System.out.println(key+":"+mp.get(key));
		    }
	}

}
