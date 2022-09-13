package Exceptions;

import java.io.File;

public class Delete_File {
	public static void main(String args[]) {
		File f = new File("C:\\Users\\ustjavafsdb216\\newFile.txt");
		boolean value = f.delete();
		
		if(value) {
			System.out.println("File deleted");
		}
		else {
			System.out.println("File not deleted");
		}
	}
}
