package Array_program;

import java.util.Arrays;

public class singleDime {

	public static void main(String[] args) {

      // int a[]=new int[5];
       int a[]= {30,20,40,60};
       System.out.println(a[2]);
       System.out.println(a.length);//4
       Arrays.sort(a);
        for(int i=0;i<=a.length-1;i++) //indexing start form 0
        {
        	System.out.println(a[i]);
        }
       
        for(int i=a.length-1;i>=0;i--)
        {
        	System.out.println(a[i]);
        }	


	}

}
