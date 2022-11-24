package Hashmap;

import java.util.HashMap;
import java.util.Set;

public class countrepeteadString {

	public static void main(String[] args) {
	
		String str="abc xyz acv abc xyz absdg kay kay";
		String[] s1 = str.split(" ");
		
		HashMap<String,Integer> mp=new HashMap<String,Integer>();
		for(int i=0;i<=s1.length-1;i++)
		{
			String string = s1[i];
			if(mp.containsKey(string))
			{
				mp.put(string,mp.get(string)+1);
			}
			else
			{
				 mp.put(string, 1);
			}
		}
	   Set<String> string1 = mp.keySet();
	   for(String string2:string1)
	   {
		   System.out.println(string2+":"+mp.get(string2));
	   }
	}
	

}
