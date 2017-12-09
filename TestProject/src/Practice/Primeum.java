package Practice;

public class Primeum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 printPrimes(1000);

    }

static void printPrimes(int max) {
    int counter = 0;
    for (int i = 2; i <= max; i++) {
        for (int n = 2; n < i; n++) {
            if (i % n == 0) {
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println(i);
            counter = 0;
        }
    }
	}

}
