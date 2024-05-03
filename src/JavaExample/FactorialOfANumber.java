package JavaExample;

public class FactorialOfANumber {

	public static void main(String[] args) {

		int num = 15;
		long fact = 1;
		for (int i = num; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println("Factorial of a number is " + fact);
	}
}
