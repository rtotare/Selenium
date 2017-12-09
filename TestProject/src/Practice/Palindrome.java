package Practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println("Program for finding palindrome number");
		int r,s,temp, no;
		 temp =0;
		 System.out.println("Enter number:");
		 Scanner sc= new Scanner(System.in);
		 no= sc.nextInt(); // get integer value
		 s=no;
		 while(no>0)
			 
		 {
			 r=no%10;
			 no=no/10;
			 temp=temp*10+r;
		 }
		 if(temp==s)
		 {
			 System.out.println(s  +" Is a palindrome number");
		 }
		 else
		 {
			 System.out.println(s  +"  Is not palindrome number");
		 }

	}

}
