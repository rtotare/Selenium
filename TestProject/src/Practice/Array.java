package Practice;

public class Array {

	public static void main(String[] args) {
		int[][] a= new int [5][4];
		
		a[0][0] = 10;
		a[0][1] = 31;
		a[0][2] = 5;
		a[0][3] = 8;
		
		a[1][0]	= 17;	
		a[1][1]	= 25;	
		a[1][2]	= 13;	
		a[1][3]	= 3;	
		
		
		a[2][0]	= 18;	
		a[2][1]	= 6;	
		a[2][2]	= 23;	
		a[2][3]	= 3;	
		
		
		a[3][0]	= 30;	
		a[3][1]	= 28;	
		a[3][2]	= 11;	
		a[3][3]	= 20;	
		
		a[4][0]	= 7;	
		a[4][1]	= 24;	
		a[4][2]	= 19;	
		a[4][3]	= 22;	
		
	/*	int r=a.length;
		System.out.println(r);
		
		int c=a[0].length;
	System.out.println(c);	 */
				
		
System.out.println("Number of rows:" +a.length);  //5
System.out.println("Number of cols:" + a[0].length); //4


for(int i=0; i<a.length;i++)
{
	for(int j=0; j<a[0].length; j++)
	{
		System.out.print(a[i][j]+ "- -"); 
	}	
		System.out.println();
}
}


}