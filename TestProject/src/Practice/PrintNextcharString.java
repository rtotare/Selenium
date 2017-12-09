package Practice;

public class PrintNextcharString {

	public static void main(String[] args) {
		String str="abcdez";
		String mainstr="abcdefghijklmnopqrstuvwxyz";
		System.out.println("Print next char");
		for(int i=0;i<str.length(); i++)
			if(str.charAt(i)=='z')
			{
				System.out.println("a");
			}
			else
		{
			System.out.print((mainstr.charAt(mainstr.indexOf(str.charAt(i))+1)));
		}
	
		
		
		
	}

}
