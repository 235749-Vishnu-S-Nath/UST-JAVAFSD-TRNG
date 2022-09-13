package Exceptions;

import java.io.FileReader;

public class Simple_FileReader {

	public static void main(String[] args) {
		char array[]= new char[100];
		try {
			FileReader input = new FileReader("C:\\Users\\ustjavafsdb216\\newFile.txt");
			input.read(array);
			System.out.println("Data in the File");
			System.out.println(array);
			input.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}