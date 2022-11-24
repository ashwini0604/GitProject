package string;

public class ReverseNo1 {

	public static void main(String[] args) {
		
		int num=45678;
		int result=0;
		
//		String rev="";
//		String snum = Integer.toString(num);
//		for(int i=snum.length()-1;i>=0;i--)
//		{
//			rev=rev+snum.charAt(i);
//		}
//		int revNum = Integer.parseInt(rev);
//		System.out.println(revNum);
		
        while(num>0)
        {
        	int rem=num%10;
        	result=result*10+rem;
        	num=num/10;
        }
		System.out.println(result);
	}

	

}


