package string;

public class whiteSpace {

	public static void main(String[] args) {
		
		String name="w e l c o m e";
//	to count the space 
		int count=0;
//		
//		for(int i=0;i<=name.length()-1;i++)
//		{
//			int str=name.charAt(i);
//		    if(str==' ')
//		     {
//			  
//			  count++;
//		      }
//		  
//		}
//		System.out.println("total no of space in "+name+" is "+ count);
		
		
		//to remove all space from string i.e. we get string welcome
	       String str1=name.replaceAll(" ", "");
	       System.out.println(str1);
	
	
	
	
	}

}
