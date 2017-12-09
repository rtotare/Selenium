package Practice;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		
		String str = " ";
		int count =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		str=sc.nextLine();
		
		for(int i=0; i<str.length(); i++)
		{
		  switch(str.charAt(i))
		
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
					count++;
				}
		
		}
		
   System.out.println("Number of vowels are : " + count);
	}

}
