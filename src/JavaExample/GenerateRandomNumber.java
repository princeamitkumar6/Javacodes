package JavaExample;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumber {

	public static void main(String[] args) {

		// Approach 1 :- Using Random class
		Random rand = new Random();
		int rand_int = rand.nextInt(99999);
		System.out.println(rand_int);

		double rand_double = rand.nextDouble();
		System.out.println(rand_double);

		// Approach 2:- Using Math class
		System.out.println(Math.random());

		// Approach 3 :- Apache commons-lang api
		// first - Download driver
		String rand_var = RandomStringUtils.randomNumeric(4);
		System.out.println(rand_var);

		String rand_str = RandomStringUtils.randomAlphabetic(7);
		System.out.println(rand_str);
	}

}
