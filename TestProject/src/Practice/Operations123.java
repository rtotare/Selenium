package Practice;

//import org.junit.Test;
public class Operations123 implements Arithmatic,Multiplication{
//@Test
	 public static void main(String[] args) {
		 Operations123 op=new Operations123();
		 op.add();
		 op.sub();
		 op.mul();
	 }
	 
	 
	@Override
	public void add()
	{
		int a = 5,	b=6;
		int sum=a+b;
		
		System.out.println(sum);
	}
	
//@Test
	@Override
	public void sub()
	{
		 int a=9, b=5;
		 int sub=a-b;
		System.out.println(sub);
	}
	
@Override
public void mul() {
	

	{
		 int a=9, b=5;
		 int mul=a*b;
		System.out.println(mul);
	}
	
}

}
