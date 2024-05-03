package JavaExample;

public class CountOccurenceOfChar {

	public static void main(String[] args) {

		String s = "Java is a programming language";

		int total_length = s.length();
		int after_removal_total_length = s.replace("g", "").length();

		int count = total_length - after_removal_total_length;
		System.out.println("Number of occurences of a " + count);

	}

}
