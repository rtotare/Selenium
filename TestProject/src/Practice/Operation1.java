package Practice;

public class Operation1 {
	
	static int a=50;
	int b=60;
	public static void main(String[] args)
	 {
		Operation1  a = new Operation1();
				a.add();
				sub();
				Operation1 m = new Operation1();
		      m.mul();
		      div();
		}
		
	void add()
	 {
		int c=a+b;
		System.out.println(c);
	 }
	
	 static void sub()
	  {
		 int a=40;
		 int b=20;
		 int c, d;
		 c=a-b;
		 d=Operation1.a-b;
		 System.out.println(c);
		 System.out.println(d);
	  }
	 
	 public void mul()
	   {
		 int c=10;
		 int d= c* Operation1.a;      // int d= c* Operation1.a;
		 System.out.println(d);
   	  }
	 
	 public static void div()
	 	 
	 {
		int b=25;
		int c;
		c= Operation1.a/b;
		System.out.println(c);
	 }
	
}




