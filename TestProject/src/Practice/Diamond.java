package Practice;

public class Diamond {

	public static void main(String[] args) {
		for(int i=1; i<=5;i++)
		{
			for(int j=1;j<=5-i; j++)
			  {
				System.out.print(" ");
			  }
			 
			for(int k=1; k<=i; k++)
				
			  {
			System.out.print("*" + " ");			
			  }
		System.out.println(" ");
		}
		
		
		
		//System.out.println("lt");
		
		for(int i=1; i<=5;i++)
		{
			for(int j=1;j<=i; j++)
			  {
				System.out.print(" ");
			  }
			 
			for(int k=i; k<=4; k++)
				
			  {
				System.out.print("*" + " ");			
			  }
		System.out.println(" ");
		}
		
	}	
		
	}


