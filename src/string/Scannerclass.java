package string;

import java.util.Scanner;

public class Scannerclass {

     
	public static void main(String[] args) {

     Scanner sc= new Scanner(System.in);
     System.out.println("Enetr age:");
     int age=0;
     do {
    	 age=sc.nextInt();
         if(age<=18)
         {
        	 System.out.println("young");
         }
         else if(age>18 && age<30)
         {
        	 System.out.println("adult"); 
         }
         else if(age>30 && age<60)
         {
        	 System.out.println("old"); 
         }
     }while(age>60);
     
	}
}
