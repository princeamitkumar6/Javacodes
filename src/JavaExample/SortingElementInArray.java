package JavaExample;

import java.util.Arrays;
import java.util.Collections;

public class SortingElementInArray {

	public static void main(String[] args) {

		// Approach 1:- Using Arrays.parallelSort()
//		int arr[] = { 30, 20, 40, 50, 10 };
//		System.out.println("Before " + Arrays.toString(arr));
//		Arrays.parallelSort(arr);
//		System.out.println("After " + Arrays.toString(arr));

		// Approach 2:- Arrays.sort()
//		int arr[] = { 30, 20, 40, 50, 10 };
//		System.out.println("Before " + Arrays.toString(arr));
//		Arrays.sort(arr);
//		System.out.println("After " + Arrays.toString(arr));
		
		// Approach 3:- Reverse sorting i.e descending order
		Integer arr[] = { 30, 20, 40, 50, 10 };
		System.out.println("Before " + Arrays.toString(arr));
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("After " + Arrays.toString(arr));
	}

}
