package Practice;

import java.util.Scanner;

public class SortString {
	   public static void main(String[] input)
	    {
	   	    int i,j;
		   String temp;
		   System.out.println("enter 5 string");
		   Scanner sc= new Scanner(System.in);
		String names []=  new String[5];
		   
		   for( i=0; i<5; i++)
		   {
			   names[i]=sc.nextLine();
  		   }
		   System.out.println(" print alphabet in sorting");
		   
		   for(i=0; i<5; i++)
		   {
			   for(j=1;j<5;j++)
			          {
				      if(names[j-1].compareTo(names[j])>0)
						  {
					       temp=names[j-1];
					        names[j-1]=names[j];
					        names[j]=temp;
						  }
			           }
		     }
		   
		
		   for(i=0;i<5;i++)
	        {
	            System.out.println(names[i]);
	        }
	    }
		   
		   
	}
	