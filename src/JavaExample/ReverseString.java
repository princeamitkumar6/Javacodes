package JavaExample;

public class ReverseString {

	public static void main(String[] args) {

//  Method 1 :- With help of string 

		// String s = "welcome";
		// String rev = "";

		// for (int i = s.length() - 1; i >= 0; i--) {
		// rev = rev + s.charAt(i);
		// }

		// System.out.print(rev);

// Method 2:- Without using char and length Method

		String s = "Welcome";
		String rev = "";
		char[] c = s.toCharArray();

		for (int i = c.length - 1; i >= 0; i--) {

			rev = rev + c[i];
		}

		System.out.println(rev);

// Approach 3:- StringBuffer
		StringBuffer sb = new StringBuffer("Welcome");
		System.out.println(sb.reverse());

// Approach 3:- StringBuffer
		StringBuilder sb1 = new StringBuilder("Selenium");
		System.out.println(sb1.reverse());
	}
	
}
