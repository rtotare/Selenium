package Practice;

import java.util.Scanner;

public class StrigPractice {

	public static void main(String[] args) {
		
		System.out.println("use of char at method");
		String str="'a','b','c','d'";
		System.out.println(str.charAt(5));
		
		String str1=" My name is RITUJA";
        System.out.println("Original string:" + str1);
        
        System.out.println("print specified charachter");
        System.out.println(str1.charAt(12));
        
        System.out.print("Sting in uppercase: ");
        System.out.println(str1.toUpperCase());
        
        System.out.println("String in lowercase: "+ str1.toLowerCase());
        
        String str2= "I am girl";
        System.out.print("concatinate two string:");
        System.out.println(str2.concat(str1));
                           
        System.out.println("Substring of given string");
        System.out.println(str2.substring(3));
        
        System.out.println("trim method to remove extra spaces given string");
        String q= "  sky is blue   ";
      //  trim method removes all white spaces
        System.out.println(q);
        System.out.println(q.trim());
        
        
        System.out.println("Substring operation");
      //use of substring  
        System.out.println(q.substring(3));
        System.out.println(q.substring(3, 6));
        
        System.out.println("print character from a to z");
        char ch;
        for( ch='a'; ch<='z'; ch++)
        {
        	System.out.print(ch);
        }
        		
        // String compare method using equal/== symbol
        System.out.println("Program to Comapre two string");
        String s1 = "Test program ";
        String s2= "Test Programm " ;
        String s3 =" Test program";
        System.out.println(s1.equals(s2));     // false
        System.out.println(s1.equals(s3));     // true
        System.out.println(s2 == s3);          // false
        
        // Replace method 
        System.out.println("Program for replace method");
        String r = "hello world";
        System.out.println(r.replace("o", "@"));
        System.out.println(r.replaceFirst("he", "ha"));
        System.out.println(r.replaceAll("hello", "hi"));
        
        
        
        
        
      }

}
