package JavaExample;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		// Logic - 1 : Using 3rd Variable
		/*
		 * int a = 10; int b = 20;
		 * 
		 * System.out.println("Before swap a = " + a );
		 * System.out.println("Before swap b = " + b );
		 * 
		 * int temp; temp = a; a = b; b = temp;
		 * 
		 * System.out.println("After swap a = " + a );
		 * System.out.println("After swap b = " + b );
		 */

		// Logic - 2 : Without Using 3rd Variable
		/*
		 * int a = 10; int b = 20;
		 * 
		 * System.out.println("Before swap a = " + a);
		 * System.out.println("Before swap b = " + b);
		 * 
		 * a = a + b; // 30 b = a - b; // 20 a = a - b; // 10
		 * 
		 * System.out.println("After swap a = " + a);
		 * System.out.println("After swap b = " + b);
		 */

		// Logic - 3 : Using / and * when no zero is present
		/*
		 * int a = 10; int b = 20;
		 * 
		 * System.out.println("Before swap a = " + a);
		 * System.out.println("Before swap b = " + b);
		 * 
		 * a = a * b; b = a / b; a = a / b;
		 * 
		 * System.out.println("After swap a = " + a);
		 * System.out.println("After swap b = " + b);
		 */

		// Logic - 4 : Single line
		/*
		 * int a = 10; int b = 20; System.out.println("Before swap a = " + a);
		 * System.out.println("Before swap b = " + b);
		 * 
		 * b = a + b - (a = b);
		 * 
		 * System.out.println("After swap a = " + a);
		 * System.out.println("After swap b = " + b);
		 */

		// Logic - 5 : Using bitwise XOR operator (^)
		// bitwise xor  - For same bit zero and for different bit 1.
		// 10 = 01010
		// 20 = 10100
		// ------------
		//      11110  = 30
		int a = 10;
		int b = 20;

		System.out.println("Before swap a = " + a);
		System.out.println("Before swap b = " + b);

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After swap a = " + a);
		System.out.println("After swap b = " + b);
	}

}
