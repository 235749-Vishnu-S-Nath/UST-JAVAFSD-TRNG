package Exceptions;

import java.io.File;

public class Simple_File_Creation {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\ustjavafsdb216\\newFile.txt");
		try {
			boolean value = file.createNewFile();
			if(value) {
				System.out.println("New file created");
			}
			else {
				System.out.println("The file alread Exists");
			}
		}catch(Exception e) {
			e.getStackTrace();
		}

	}

}
