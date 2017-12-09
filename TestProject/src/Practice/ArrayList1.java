package Practice;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> num = new ArrayList<String>();
		num.add("one");
		num.add("two");
		num.add("three");
		num.add("four");
		System.out.println(num);

		for (String no : num) {
			System.out.println(no);
		}

	}

}
