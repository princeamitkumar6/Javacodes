package JavaExample;

public class RemoveJunkCharInString {

	public static void main(String[] args) {
		String s = "automation+++***@@@Testing";
		// Regular Expression - Through regular expression we can 
		// ^ (Char operator) - If we find anything else it will replace.
		String s1= s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);

	}

}
