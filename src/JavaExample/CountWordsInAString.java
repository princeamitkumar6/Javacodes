package JavaExample;

public class CountWordsInAString {

	public static void main(String[] args) {
		String s = "Hello amit kumar singh";
		int count = 1;

		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println("Number of words in a string:- " + count);
	}
}
