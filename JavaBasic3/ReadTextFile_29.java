package JavaBasic3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile_29 {
	public static void main(String[] args) throws FileNotFoundException {
		
		//1.Approch 
		/*
		File file = new File("C:\\Users\\jivan\\OneDrive\\Desktop\\Daily task.txt");
		Scanner sc = new Scanner(file);
		
		while(sc.hasNext())
		{
			System.out.println(sc.nextLine()); 
		}
		
		*/
		//2 Approch
		
		File file = new File("C:\\Users\\jivan\\OneDrive\\Desktop\\Daily task.txt");
		Scanner sc = new Scanner(file);
		
		sc.useDelimiter("\\z");
		System.out.println(sc.next());
		
		
	}
}
