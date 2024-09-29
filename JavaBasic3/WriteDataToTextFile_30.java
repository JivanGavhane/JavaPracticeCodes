package JavaBasic3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToTextFile_30 {
	public static void main(String[] args) throws IOException {
		
		FileWriter fi = new FileWriter("C:\\Users\\jivan\\OneDrive\\Desktop\\Daily task.txt");
		BufferedWriter fis = new BufferedWriter(fi);
		
		fis.write("My name is Jivan");
		
		System.out.println("Completed the Operation");
		fis.close();
	}
}
