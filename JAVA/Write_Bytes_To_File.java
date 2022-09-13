package Exceptions;

import java.io.FileOutputStream;

public class Write_Bytes_To_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "This is a line text inside the file.";
		try {
			FileOutputStream output = new FileOutputStream("C:\\Users\\ustjavafsdb216\\output.txt");
			byte[] array = data.getBytes();
			
			output.write(array);
			System.out.println("File writing successful");
			output.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
