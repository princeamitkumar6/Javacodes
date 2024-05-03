package JavaExample;

import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 10, 40, 30 };

		// Approach 1 :- Inner for loop
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					System.out.println(arr[i]);
//				}
//			}
//		}

		// Approach 2 :- Using HashSet Approach
		int arr1[] = { 10, 20, 30, 10, 40, 30 };
		HashSet<Integer> hs = new HashSet<>();

		boolean flag = false;
		for (int l : arr1) {
			if (hs.add(l) == false) {
				System.out.println("Find duplicate element " + l);
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("Found");
		}

	}
}
