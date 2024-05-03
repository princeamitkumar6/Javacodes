package JavaExample;

public class ReverseWordsInStrings {

	public static void main(String[] args) {
		// For loop
//		String str = "welcome to java selenium";
//		String[] st = str.split(" ");
//		String revStr = "";

		// Approach 1:-
//		for (int i = 0; i < st.length; i++) {
//			String revWord = "";
//			for (int j = st[i].length() - 1; j >= 0; j--) {
//				char c = st[i].charAt(j);
//				revWord = revWord + c;
//			}
//			revStr = revStr + revWord + " ";
//		}
//		System.out.println(revStr);

		// For each
//		for (String w : st) {
//
//			String revWord = "";
//
//			for (int j = w.length() - 1; j >= 0; j--) {
//
//				char c = w.charAt(j);
//				revWord = revWord + c;
//			}
//			revStr = revStr + revWord + " ";
//		}
//
//		System.out.println(revStr);

		// Approach 2-
		String str1 = "welcome to java selenium";
		String[] st1 = str1.split("\\s");
		String revStr1 = "";

		for (String w : st1) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			revStr1 = revStr1 + sb.toString() + " ";
		}
		System.out.println(revStr1);
	}
}
