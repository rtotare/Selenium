package Practice;
import java.util.Scanner;
public class PrimeNumber1
{
	
		 public boolean Prime(int num) 
		 {
		   for (int i = 2; i <num/2; i++)
		       {
		       if( num % i == 0 )
		           {
		             return false;
		           }
		      }
		     return true;
		 }
		
		
		 public static void main(String[] args)  {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Please enter a number: ");
		 int num = sc.nextInt();
		 System.out.println("\n Prime Numbers from 1 to "+ num);

		 PrimeNumber1 primeNum = new PrimeNumber1();
		 
		 for (int i = 2; i <= num; i++)
		      {
		         if(primeNum.Prime(i) )
		           {
		               System.out.println( i);
		           }
		      }
		 } 
}		 
		 



