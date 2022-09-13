package Exceptions;

import java.io.FileOutputStream;

public class File_Output_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "This is a line of text inside the file.";
		try {
			FileOutputStream out = new FileOutputStream("C:\\Users\\ustjavafsdb216\\output.txt");
			byte dataBytes[] = data.getBytes();
			out.write(dataBytes);
			System.out.println("Data is written to the file.");
			out.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
