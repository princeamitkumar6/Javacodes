package JavaExample;

import java.util.Arrays;

public class MutableVsImutable {

	public static void main(String[] args) {
		
		// Mutable - Can change
		int a[] = {40,20,30,10};
		
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		
		// Immutable - Can't change
		
		String s = new String("Welcome");
		
		System.out.println(s);
		
		s = s.concat("to java");
		System.out.println(s);
		
		System.out.println(s);
	}

}
