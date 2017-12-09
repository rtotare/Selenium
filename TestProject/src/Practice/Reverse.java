package Practice;

public class Reverse {

	public static void main(String[] args) {
		

		int a [] = {7,9,3,4,6};
		int c = a. length;
		System.out.println(c);       //System.out.println(a.length);
		
		
		System.out.println(a[0]);
		System.out.println(a[3]);    //right array line by line to print single value 
		
		System.out.println("int array a:");
		
		for(int i=0; i<c; i++)    //c = a. length;
		{
			System.out.println(a[i]);
		}
		
		 System.out.println("Print reverse array:");   
		
		for(int i=a.length-1; i>=0; i--)
		{
		 System.out.println(a[i]);
		}
		 
		
		System.out.println("array of string:");
		
		String color[] ={"red", "green","yellow"};
		
		System.out.println("values of color array:");
		
		for(int i=0; i<color.length; i++)
		{
			System.out.println(color[i]);
		}
		
		
		System.out.println("Reverse array of color:");
		
		for(int i=color.length-1; i>=0; i--)
		{
		  System.out.println(color[i]);
		
		}
	}
}


