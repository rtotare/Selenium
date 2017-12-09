package Practice;

import java.util.Scanner;

public class Palidrome1string {

public static void main(String[] args) {
		
		System.out.println("Enter string to check palindrome");
		Scanner sc= new Scanner(System.in);
		String palindrome1 =sc.nextLine();
		
		// Creating object to call reverse method 
		
		Palidrome1string pn=new Palidrome1string();
		
		if(pn.reverse(palindrome1))
			
			
		   {
			  System.out.println("Given String is palindrome");
		   }
		else
		    {
			    System.out.println("Given String Not palindrome");
	     	}
		   
		}
		
	// Reverse method 
		
		public boolean reverse (String str)
		
		{
			
			int i =str.length()-1;
			int j=0;
			
			while(i>j)
			     {
			if(str.charAt(i)!=str.charAt(j)){
				return false;
						}
			i--;
			j++;
			}
			return true;			
		}
		
	}

