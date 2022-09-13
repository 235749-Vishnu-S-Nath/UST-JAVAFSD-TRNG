package Exceptions;

import java.io.FileInputStream;
import java.io.InputStream;

public class File_Input_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte array[] = new byte[100];
		try {
			InputStream input = new FileInputStream("C:\\Users\\ustjavafsdb216\\newFile.txt");
			System.out.println("Available bytes in the file: "+input.available());
			input.read(array);
			System.out.println("Data from the file: ");
			
			String data = new String(array);
			System.out.println(data);
			input.close();
		}catch(Exception e) {
			e.getStackTrace();
			}
	}

}
