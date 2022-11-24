package string;

public class AmstrongNumber {

	public static void main(String[] args) {
   int no=153; //1^3=1  5^3=125 3^3=27 
	
    int sum=0;
    for(int i=no;i>0;i=i/10)
    {
    	int rem=i%10;
    	sum=sum+(rem*rem*rem);
    }
     if(no==sum)
     {
    	 System.out.println("given no is amstrong");
    	 
     }else
     {
    	 System.out.println("given no is not amstrong");
    	 
     }

	}

}
