package JavaExample;

public class PrimeNumberOrNot {

	public static void main(String[] args) {

		int num = 17;
		int count = 0;

		if (num > 1) {

			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
					System.out.println(i + " " + count);
				}
			}
			if (count == 2) {
				System.out.println("Number is prime");
			} else {
				System.out.println("Not a prime number");
			}

		} else {
			System.out.println("Not a prime number");
		}
	}

}
