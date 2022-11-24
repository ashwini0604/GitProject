package Hashmap;

public class withoutHashmap {

	public static void main(String[] args) 
	{
		String str="abcavc";
		int count=0;
		char[] str1 = str.toCharArray();
		  for(int i = 0; i <str1.length-1; i++) {  
	             
	            for(int j = i; j <str1.length-1; j++) {  
	                if(str1[i] == str1[j] && str1[i] != ' ') {  
	                    count++;  
	                    //Set string[j] to 0 to avoid printing visited character  
	                    str1[j] = '0';  
	                }  
	            }  
	            //A character is considered as duplicate if count is greater than 1  
	            if(count > 1 && str1[i] != '0')  
	                System.out.println(str1[i]);  
	        }  
	    }  

	
	}
