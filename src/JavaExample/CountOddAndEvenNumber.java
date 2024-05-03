package JavaExample;

import java.util.Scanner;

public class CountOddAndEvenNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		int even_Count = 0;
		int odd_count = 0;

		while (num > 0) {
			
			int temp = num % 10;

			if (temp % 2 == 0) {
				even_Count++;
			} else {
				odd_count++;
			}

			num = num / 10;
		}

		System.out.println("Even Count: " + even_Count);
		System.out.println("Odd Count: " + odd_count);
	}

}
