package Practice;

public class Fabonacicseries {

	public static void main(String[] args) {
		
		// Fabonacic series are {0,1,1,2,3,5,8,13,21}
		
		int a=0;
		int b=1;
		int sum;
		int n=10;
		System.out.println(a);
		System.out.println(b);
		for(int i=0; i<n; i++)
		{
			sum=a+b;
			a=b;
			b=sum;
      		System.out.println(sum);
	    }
	}
}