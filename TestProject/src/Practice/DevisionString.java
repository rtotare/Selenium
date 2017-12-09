package Practice;

import java.util.Scanner;

public class DevisionString {
	public static void main(String[] args) {
		String str= "";
		System.out.println("enter string");
		Scanner sc= new Scanner(System.in);
		str=sc.nextLine();
		int len=str.length();
		int mid=len/2; //get the middle of the String
		String[] parts = {str.substring(0, mid),str.substring(mid)};
		System.out.println(parts[0]); //first part
		System.out.println(parts[1]); //second part
         
	}

}
