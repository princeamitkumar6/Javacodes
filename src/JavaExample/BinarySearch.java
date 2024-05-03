package JavaExample;

import java.util.Arrays;

public class BinarySearch {
	// Array should be in sorted order.
	// Identify mid value

	public static void main(String[] args) {

		// Approach 1:- Implemented through Logic
		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		boolean flag = false;
		int key = 110;

		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				System.out.println("Element found..");
				flag = true;
				break;
			}
			if (arr[mid] > key) {
				high = mid - 1;
			}
			if (arr[mid] < key) {
				low = mid + 1;
			}
		}
		if (flag == false) {
			System.out.println("Element not found..");
		}

		// Approach 2:- Arrays.binarySearch()
		System.out.println(Arrays.binarySearch(arr, 60));
	}
}
