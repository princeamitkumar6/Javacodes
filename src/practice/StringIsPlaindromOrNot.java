package practice;

public class StringIsPlaindromOrNot {

	public static void main(String[] args) {

		String s = "MADAM";
		String org = s;
		String rev = "";

		for (int i = 0; i < s.length(); i++) {
			rev = s.charAt(i) + rev;
		}

		if (org.equals(rev)) {
			System.out.println(rev + " is palindrom");
		} else {
			System.out.println(rev + " is Not a palindrom");
		}

	}

}
