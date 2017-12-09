package Practice;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a[];
		//int b[] = new int[5];
		int c[] = { 1, 5, 4, 6 };
		int d = c.length;
//		System.out.println(d); // System.out.println(c.length);
		for (int i = 0; i < c.length; i++) {
			// System.out.println(c[i]);
		}

		String color[] = { "r", "b", "g" };
		for (int i = 0; i < color.length; i++) {
			// System.out.println(color[i]);
		}
		
		int k = 0;
		for (int i = 0; i < d; i++) {
			// System.out.println(c[i]);

			k = k + c[i];

		}
		System.out.println(k);
	}
}
