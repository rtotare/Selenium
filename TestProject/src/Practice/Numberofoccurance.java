package Practice;

import java.util.Scanner;

public class Numberofoccurance {

private static Scanner sc;
private static Scanner sc1;

public static void main(String[] args) {
	
	System.out.println("find number of occurences of v in javvva");
	
	String str= "javvva";
	int counter1 =0;
	for(int i=1; i<str.length(); i++)
		{
		if (str.charAt(i)== 'v')
		{
			counter1++;
		}
	}
System.out.println(counter1);
	
	

	String str1= "";
	System.out.println("Enter string :" );
	sc = new Scanner(System.in);
	str1 =sc.nextLine();
	
	System.out.println("Enter character :" );
	sc1 = new Scanner(System.in);
	String str2= sc1.nextLine();
			
	int counter =0;
	for(int i=0; i<str1.length(); i++)
		{
		if (str1.charAt(i)==str2.charAt(0))
		{
			counter++;
		}
	}
	System.out.println(counter);
}
}