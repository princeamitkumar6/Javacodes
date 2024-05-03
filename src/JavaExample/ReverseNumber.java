package JavaExample;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		// Approach -1 :- Using algorithm
//		int rev = 0;
//		while (num != 0) {
//			rev = rev * 10 + num % 10;
//			num = num / 10;
//		}
//		System.out.println(rev);

		// Approach 2 - Using StringBuffer Class

		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		System.out.println(rev);

		// Approach 3 - Using StringBuilder Class

//		StringBuilder sb = new StringBuilder();
//		sb.append(num);
//		StringBuilder rev = sb.reverse();
//		System.out.println(rev);

	}
}
