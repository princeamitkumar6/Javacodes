package JavaExample;

public class MinAndMaxElementsInArrays {

	public static void main(String[] args) {
		int arr[] = { 120, 30, 60, 40, 10 };

		// Find max number
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println(max);

		// Find min number
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}
}
