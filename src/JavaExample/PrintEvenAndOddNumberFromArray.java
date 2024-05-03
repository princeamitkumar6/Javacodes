package JavaExample;

import java.util.Arrays;

public class PrintEvenAndOddNumberFromArray {

	public static void main(String[] args) {
		int a[] = { 2, 4, 3, 6, 9 };
		int eve[] = new int[a.length];
		int odd[] = new int[a.length];
		for (int i = 0; i < a.length ; i++) {
			if (a[i] % 2 == 0) {
				// System.out.println("Even number " + a[i]);
				eve[i] = a[i];
			} else {
				// System.out.println("Odd Number " + a[i]);
				odd[i] = a[i];
			}
		}
		System.out.println(Arrays.toString(eve));
		System.out.println(Arrays.toString(odd));
		
		for(int num : eve) {
			System.out.print(num);
		}
	}

}
