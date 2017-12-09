package Practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("Program finding prime number");
		int num;
		boolean flag=false;
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(int i=2; i<num/2; i++)
		 {
		   //condition for non prime number 
			if(num%i==0)
			  {
				flag=true;
				break;
		      }
		 }
    if (flag)
       {
          System.out.println("Number is not prime");	
       }
    else
       {
    	  System.out.println("Number is prime");
       }
}
}

