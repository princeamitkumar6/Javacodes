package JavaExample;

public class SumOfElementsInArray {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 50, 10 };
		int sum = 0;

		// Approach 1:- For loop
//		for (int i = 0; i < a.length; i++) {
//			sum = sum + a[i];
//		}
//
//		System.out.println(sum);

		// Approach 2:- Enhanced for loop

		for (int value : a) {
			sum = sum + value;
		}
		
		System.out.println(sum);

	}

}
