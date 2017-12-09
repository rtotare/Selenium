package Practice;

import java.util.Scanner;

public class StringProgramms {

	public static void main(String[] args) {
		
		System.out.println("Programm to find index of word in given string");
		String s= "My Name is Rituja";
		int index = s.indexOf("Rituja");
		if(index==-1)
		{
			System.out.println("String not found");
		}
		else
		{
			System.out.println("Index of string :" + index);  
		}
		
		
		System.out.println("Programm to find search word within string");
		System.out.println(s.contains("Rituja"));    // op is true
			
		
		System.out.println("Programm for number of occurence of given character in string ");
        String r= " Java is again a java ";
        int count= r.length()-r.replace("a", "").length();
        		System.out.println("No of occurence is:" + count);
        
        System.out.println("Programm for reversing string");
        String p="";
        System.out.println("Enter string which you want to reverse: ");
        Scanner sc= new Scanner(System.in);
        p =sc.nextLine();
        char [] pArray = p.toCharArray();
       // System.out.println(pArray);
        for(int i=p.length()-1; i>0; i--)
           {
        	System.out.print(pArray[i]);
           }
         
        
        System.out.println("Programm for Reverse string using CharAt method");
        String str="ABCD LMNO XYZ ";
        for(int i=str.length()-1; i>0; i--)
 	    {
	         System.out.print(str.charAt(i));
        }
	                
        System.out.println();
        System.out.println("Number of words in given string");
        String t= "  sky is blue   ";
      //  trim method removes all white spaces
       // System.out.println(t);
       // System.out.println(t.trim());
        String [] words= t.trim().split(" ");
        System.out.println("Total words in string is :"+ words.length);
        
                      
        System.out.println();
        System.out.println("Program tp Remove number of white spaces from griven string");
        String  str1 ="    friend using replace all method   ";
        System.out.println(str1.replaceAll("\\s", "")); // string s to be replace with white spaces (s is mandatory letter)
        
        
        System.out.println("Program tp Remove number of white spaces from griven string using array ");
      String str2=" friend  without using replace all method ";
         char[] strArray = str2.toCharArray(); // convert string to character array
         StringBuffer sb = new StringBuffer();
         for (int i = 0; i < strArray.length; i++)
        {
          if( (strArray[i] != ' ') && (strArray[i] != '\t') )
            {
              sb.append(strArray[i]);
            }
        }
      System.out.println(sb); 
        
      
      
      
      
      
      
      
      
      
      
      
      
        
	}
 
}
