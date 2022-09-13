package Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;

public class Buffered_Reader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char array[] = new char[100];
		try {
			FileReader file= new FileReader("C:\\Users\\ustjavafsdb216\\newFile.txt");
			
			BufferedReader input = new BufferedReader(file);
			
			input.read(array);
			System.out.println("Data in the file: ");
			System.out.println(array);
			input.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
