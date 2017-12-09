package Practice;

public class MethodOverloading {
	
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public void add(int a, int b, int d)
	{
		int c= a+b+d;
		System.out.println(c);
		
	}

	// overloading with returning values
	
	public int shape(int x, int y, int u, int v)
		{
		System.out.println("Total lines in square");
		int z=x+y+u+v;
	   	return z;
	   	}
	
	
	public int shape(int x, int y, int u)
	{
		System.out.println("Total lines in triangle");
		int M =x+y+u;
		return M;
	}
		
		
	public static void main(String[] args) {
		MethodOverloading  obj= new MethodOverloading();
		
	     obj.add(5, 6);
	     obj.add(7, 3, 5);
	     
	     
	     MethodOverloading obj1= new MethodOverloading();
	     obj1.shape(1, 1, 1, 1);
	     System.out.println();
	     obj1.shape(1, 1, 1);
	}
	
	

}
