package Practice;

public class StringProgram {

	public static void main(String[] args) {
		String one = "this is my string Programm";
		//System.out.println(one.reverse());
		// System.out.println(one);
		// one = one.substring(17);
		// one= one.toUpperCase();
		// System.out.println(one);
		// String two2= one.substring(17);
		// one =one.replace(two2 ," ");
		// one= two2 + one;
		// System.out.println(one);
		
	//	for (int i = one.length()-1; i >= 0; i--) 
	//	{
	//		System.out.print(one.charAt(i));
	//	}

//		String two = new String("I am girl");
//		two = two.replace("girl", "boy");
//		// System.out.println(two);

		
		String four= "my name is rituja";
		String [] five = four.split(" "); 
		//System.out.print(four);
		for(int i=five.length-1; i>=0; i--)
		{
		System.out.print(five[i]+" ");	
		}

		
	}

}
