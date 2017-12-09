package Practice;

public class Pyryamid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
         System.out.println("pyramid for number");
	for(int i=1; i<=5;i++)
	{
		for(int j=1;j<=5-i; j++)
		  {
			System.out.print(" ");
		  }
		 
		for(int k=1; k<=i; k++)
			
		  {
			System.out.print(k + " ");			
		  }
	System.out.println(" ");
	}
	
	System.out.println("Dcrement tringle for star");
	for(int i=1;i<=5;i++)
	{
		for(int j=1; j<=5-i;j++)
		{
			System.out.print("*");
		}
		for(int k=1; k<=i; k++) 
		{
			System.out.print("  ");
		}
	
		System.out.println();
	}			
	}
	
	}


	
	
	
	
	
	
	