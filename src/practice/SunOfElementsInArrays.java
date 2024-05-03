package practice;

public class SunOfElementsInArrays {

	public static void main(String[] args) {
		int num1[] = { 10, 20, 30, 50 };
		int num2[] = { 20, 30, 40, 50 };

		int sum[] = new int[num1.length];

		for (int i = 0; i < num1.length; i++) {
			sum[i] = num1[i] + num2[i];
		}
		
		for(int  e : sum) {
			System.out.println(e);
		}

	}

}
