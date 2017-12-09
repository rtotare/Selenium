package Practice;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {

		String str;
		String Reverse = "";
		System.out.println("Enter string which want to be palindrome");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
			Reverse = Reverse + str.charAt(i);
		}
		if (str.equals(Reverse)) {
			System.out.println("  is palindrome string");
		} else {
			System.out.println("  is not palindrome string");
		}

	}

}
