package string;

public class PrimeNo1to100 {

	public static void main(String[] args) {
		int num=0;
		String primeNo="";
				
	    for(int i=1;i<=100;i++)
		{    
	    	int count=0;                        
			for(num=i;num>=1;num--)
			{
				if(i%num==0)
				{
					count++;   

				}
			}
			if(count==2)	
			{
				primeNo=primeNo+i+" \n";
				
			}	
		}
	    System.out.println("prime No from 1 to 100 are:");
	    System.out.print(primeNo);
	    
	}

}
