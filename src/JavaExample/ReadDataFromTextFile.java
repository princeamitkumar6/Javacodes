package JavaExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {

		// Approach 1:- Using FileReader and BufferedReader
//		FileReader fr = new FileReader("C:\\Users\\Softuvo QA\\Desktop\\Test Data.txt");
//		BufferedReader br = new BufferedReader(fr);
//		// String str = br.readLine();
//		String str;
//
//		while ((str = br.readLine()) != null) {
//			System.out.println(str);
//			// str = br.readLine();
//
//		}
//
//		br.close();

		// Approach 2:- Using File and Scanner
//		File file = new File("C:\\\\Users\\\\Softuvo QA\\\\Desktop\\\\Test Data.txt");
//		Scanner sc = new Scanner(file);
//
//		while (sc.hasNextLine()) {
//			System.out.println(sc.nextLine());
//		}

		// // Approach 3:- Using File and Scanner without loop
		File file1 = new File("C:\\\\Users\\\\Softuvo QA\\\\Desktop\\\\Test Data.txt");
		Scanner sc1 = new Scanner(file1);

		sc1.useDelimiter("\\z");
		System.out.println(sc1.next());

	}

}
