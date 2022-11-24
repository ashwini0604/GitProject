package string;

public class EvenOddUsingArray {

	public static void main(String[] args) {
		int [] a = {1,5,15,21,51,101};
		int even=0;
		int odd=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==1)
			{
				odd++;
				
				System.out.println("odd no is ="+a[i]);
			}
			else
			{
				even++;
				System.out.println("even no is ="+a[i]);
			}
			
			
		}
		System.out.println("the total even no :"+even);
		System.out.println("the total odd no :"+odd);

	}

}
