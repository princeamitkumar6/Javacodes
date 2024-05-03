package practice;

public class ReverseWordsInAString {

	public static void main(String[] args) {

		String s = "Java is programming language";
		String revString = "";

		String[] str = s.split(" ");

		for (int i = 0; i < str.length; i++) {
			String revword = "";
			for (int j = str[i].length() - 1; j >= 0; j--) {
				char c = str[i].charAt(j);
				revword = revword + c;
			}
			revString = revString + " " + revword;

		}

		System.out.println(revString);

	}

}

// For loop
//String str = "welcome to java selenium";
//String[] st = str.split(" ");
//String revStr = "";

// Approach 1:-
//for (int i = 0; i < st.length; i++) {
//	String revWord = "";
//	for (int j = st[i].length() - 1; j >= 0; j--) {
//		char c = st[i].charAt(j);
//		revWord = revWord + c;
//	}
//	revStr = revStr + revWord + " ";
//}
//System.out.println(revStr);