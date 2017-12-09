package Practice;

public class Pyramid1 {

	public static void main(String[] args) {
		
		System.out.println("Pyramid of 6 with diffirent values");
		 int num=6;
		 for(int i=1; i<=num;i++)
		   {
               for(int j=1; j<=num-i ;j++)	
               {
            	  System.out.print(" "); 
               }
			      for(int k=1; k<=i;k++)
			      {
			    	  System.out.print(" "  +i);
			      }
			      System.out.println(); 
   		   }
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=num-i;k++)
			{
				System.out.print(" " + k);
			}
			System.out.println();
		}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
				
	}

}
