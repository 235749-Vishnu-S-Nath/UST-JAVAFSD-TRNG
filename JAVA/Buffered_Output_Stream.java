package Exceptions;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Buffered_Output_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "This is the data in output file";
		try {
			FileOutputStream file = new FileOutputStream("C:\\Users\\ustjavafsdb216\\output2.txt");
			BufferedOutputStream output = new BufferedOutputStream(file);
			byte[] array = data.getBytes();
			output.write(array);
			System.out.println("Writing done");
			output.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
