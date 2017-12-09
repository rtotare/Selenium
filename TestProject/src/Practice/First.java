package Practice;

public class First {
	static int a = 5;
	int b = 8;

	public static void main(String[] args) {
		System.out.print("text");
		System.out.println(5);
		System.out.println(5 + a);
		int c = 15;
		int a = 12;
		System.out.println(c + a);
		System.out.println(c + First.a); //Classname.variable use to access static global variable (when if method having same local variable with diff.value)   

		First f = new First();
		f.add();
        sub();
	}

	void add() {
		int b = 4;
		System.out.println(a + b);
		System.out.println(a + this.b); // this.b=8 this.keyword only used in non static method to access non static global variable
										
	}

	static void sub() {
		int b=4;
		System.out.println(a-b);

	}

}
