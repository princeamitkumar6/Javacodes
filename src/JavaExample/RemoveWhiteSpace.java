package JavaExample;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String s = "Automation       Test       Engineer";
		s = s.replaceAll("\\s", "");
		System.out.println(s);

	}

}
