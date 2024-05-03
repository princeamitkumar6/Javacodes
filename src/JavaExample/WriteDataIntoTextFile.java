package JavaExample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		// Approach 1:- FileWritter BufferedWritter
		FileWriter fw = new FileWriter("C:\\Users\\Softuvo QA\\Desktop\\SampleFile.txt");
	    //FileWriter fw = new FileWriter("‪‪‪C:\\Users\\Softuvo QA\\Desktop\\SampleFile.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("Java");
		bw.write("Selenium");
		bw.write("Python");
		bw.write("C#");

		System.out.println("Finished");

		bw.close();
	}

}

//‪‪‪C:\Users\Softuvo QA\Desktop\SampleFile.txtmaven-archetype-quickstartmaven-archetype-quickstartmaven-quickstart-archetypemaven-quickstart-archetypemaven-quickstart-archetype