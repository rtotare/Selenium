package basic_java;

public class Mult_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]=new int [3][4];
		System.out.println("number of row =" +a.length);
		System.out.println("Number of cols =" +a[0].length);
		
		//Define array of Matrix of 3 by 4 
		
	        a[0][0]= 1 ;
		    a[0][1]= 2 ;
		    a[0][2]= 3 ;
		    a[0][3]= 4 ;
		
	        a[1][0]= 11 ;
			a[1][1]= 22 ;
			a[1][2]= 33 ;
			a[1][3]= 44 ;
		
			a[2][0]= 111 ;
			a[2][1]= 222 ;
			a[2][2]= 333;
			a[2][3]= 444 ;
			
			int rows= a.length;
			int cols = a[0]. length;
			
			
			for(int i=0; i<rows; i++) // loop for number of rows
			{
				for(int j=0; j<cols; j++) // loop for number of column 
				  {
					System.out.print(a[i][j] + " --"); // r[00], r[01] , r[02], r[03]
				   }
				System.out.println();
			}
		

     // object array is mainly used to define different data types like integer char, boolean , string decimal etc

			 System.out.println("Object array for diffirent data types :");
			
		Object ar[] = new Object[4];
        ar[0] = "hey";
    	ar[1] = 1236 ;
    	ar[2] = true ;
    	ar[3] = 23.5 ;
    	
    	for (int i=0; i<ar.length; i++)
    	{
    		System.out.println(ar[i]);
    	}
    	}
    	
	

	}
	



