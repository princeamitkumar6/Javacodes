package JavaExample;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 4, 20, 100, 5, 30 };

		System.out.println("Before sorting:- " + Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) { // Loop for number of passes

			for (int j = 0; j < arr.length - 1; j++) { // Inner Loop for iteration of each pass
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println("After sorting:- " + Arrays.toString(arr));

	}

}
