package Exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Buffered_Writer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "This is the data in output file";
		try {
			FileWriter file = new FileWriter("C:\\Users\\ustjavafsdb216\\output1.txt");
			BufferedWriter output = new BufferedWriter(file);
			output.write(data);
			System.out.println("Writing done");
			output.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}