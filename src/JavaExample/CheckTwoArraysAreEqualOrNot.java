package JavaExample;

import java.util.Arrays;

public class CheckTwoArraysAreEqualOrNot {

	public static void main(String[] args) {
		int arr1[] = { 2, 4, 5, 7 };
		int arr2[] = { 2, 4, 5, 7 ,5};

		// Approach 1:- Arrays methods
//		boolean status = Arrays.equals(arr1, arr2);
//		if (status == true) {
//			System.out.println("Arrays are equal");
//		} else {
//			System.out.println("Arrays are Not equal");
//		}

		// Approach 2:-
		boolean status = true;

		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					status = false;
				}
			}

		} else {
			status = false;
		}

		if (status == true) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are Not equal");
		}
	}

}
