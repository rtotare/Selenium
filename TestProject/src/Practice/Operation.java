package Practice;

public class Operation {
	
	static int x=700;
    static  final int y=500;
    final       int z=300;

	public static void main(String[] args) {
		
    add();    // directly call static method
    
    Operation s= new Operation();  // To call non static method create object for that method 
    s.sub();
    
    Operation ml=new Operation(); 
    ml.mul();
    
     div();
   
	}

	protected static void add()
		 {
		   int y=400;
		   System.out.println(x+y);
		   System.out.println(y + Operation.y);
		 }
			
	protected void sub()
	     {
	      int x=800;
		    System.out.println(y-z);
		    System.out.println(x-z);
		    System.out.println(x-Operation.x);
		  }
	 	
	  void mul()
	      {
//		 z=100;
		   System.out.println(z* this.z);
		   System.out.println(x*y);
	      }
				
  static void div()
	      {
		   int y=2;
		   int x= 400;
	       System.out.println(Operation.x/y);
		   System.out.println(x/y);
	      }		
		
}
