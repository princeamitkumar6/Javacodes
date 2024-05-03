package JavaExample;

import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {

		// Approach 1 :- Logic
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number ");
		int a = sc.nextInt();

		System.out.println("Enter second number ");
		int b = sc.nextInt();

		System.out.println("Enter third number ");
		int c = sc.nextInt();

//		if (a > b && a > c) {
//			System.out.println(a + " is largest number");
//		} else if (b > a && b > c) {
//			System.out.println(b + " is largest number");
//		} else {
//			System.out.println(c + " is largest number");
//		}

		// Approach 2:- Ternary operator
		int largest1 = a > b ? a : b; // Expression for largest a & b
		int largest2 = c > largest1 ? c : largest1; // Finding largest of c & largest1
		System.out.println(largest2 + " is largest number");

		// Approach 3:- Ternary operator in a single statement
		int largest = c > (a > b ? a : b) ? c : (a > b ? a : b);
		System.out.println(largest + " is largest number");
	}

}
