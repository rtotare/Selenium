package Practice;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Third op= new Third();
		int a=op.add(5,4);
		int s=op.sub(5,4);
		int m=op.mul(a,s);
		int d=op.div(m,a);
		System.out.println(d);
		//System.out.println(op.div(op.mul(op.add(4,5), op.sub(5,4)), op.add(4, 5)));
		
	}

	public static int add(int a, int b) {
		
		return a+b;
}
	
public static int sub(int a, int b) {
		
		return a-b;
}
public static int mul(int a, int b) 
{
	
	return a*b;
}
public static int div(int a, int b) {
	
	return a/b;
}
}

