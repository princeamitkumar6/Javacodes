package JavaExample;

public class LinearSearch {

	public static void main(String[] args) {
		int a[] = { 10, 20, 40, 50, 30 };

		int search_element = 130;
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			if (search_element == a[i]) {
				System.out.println("Element found " + i);
				flag = true;
				break;
			}
		}

		if (flag == false) {
			System.out.println("Element not found");
		}

	}

}
