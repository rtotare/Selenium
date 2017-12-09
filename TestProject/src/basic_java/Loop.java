package basic_java;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      System.out.println("increment number");
      
		int i=0;     // Initialization
		while(i<10)   // condition
		{
		System.out.println(i);	
		i++;          // or i=i+1 Increment 
				}
		
			
		System.out.println("Decrement number ");
		
		
	
			int j=10;   //initialization
			 while(j>0)
			 {
				 System.out.println(j);
				 j--;    // decrement 
			 }
		
		
// disadvantage of while loop is you can stuck in infinite loop and print 10  if you comment i++ or j-- comment then 
 // and hence for loop is used to over come while loop

    System.out.println("Print 1 to 10 numbers using for loop");
			 
		for(int k=0; k<10; k++)
		{
			System.out.println(k);
		}
		
//	 In the above code while and for loop works same print the same value only different is 
// Now IN for loop we force to give every thing(code) in single line so it worry about stuck because it will not go in infinite loop 	
		
			 
			 System.out.println("print addition of 1-100 numbers");
			 
			 int sum=0;  // initialize sum  is zero
			 
		for(int n=0; n<=100; n++)	
		    {
		      sum =sum+n;
		 	}
		System.out.println("Addition of 1-100 numbers are-" +sum);
			 
			 
	}
}
