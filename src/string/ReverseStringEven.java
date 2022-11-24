package string;

public class ReverseStringEven {

	public static void main(String[] args) {

    String str1="hellow welcome how are you";
      String[] s1 = str1.split(" ");
      System.out.println(s1[0]);
      for(int i=1;i<=s1.length-1;i++)
      {
    	  if(i%2==0)
    	  {
    		  String strvalue = s1[i];
    		 s1[i]= reverseString(strvalue);
    		  
    	  }
    	  System.out.println(s1[i]);
      }
	}

	private static String reverseString(String str1)
	{
		String rev="";
		for(int i=str1.length()-1;i>=0;i--)
		{
			rev=rev+str1.charAt(i);
		}
		
		return rev;


		
	}

	
	

}
