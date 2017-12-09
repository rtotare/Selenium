package basic_java;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= new int[5]; //declaration
	    a[0]= 123;  //initialization 
		a[1]= 22;
		a[2]= 66;
		a[3]= 94;
		a[4]= 333;
		
		for(int i=0; i<=a.length;i++)  // printing array 
		{
			System.out.println(a[i]);
		}
		
	

//write above code we can also declare and initialization of array at time
		
		int b[]={33,3,4,5};//declaration, instantiation and initialization  
		  
		//printing array  
		for(int i=0;i<b.length;i++)//length is the property of array  
		System.out.println(b[i]);  



	}
}