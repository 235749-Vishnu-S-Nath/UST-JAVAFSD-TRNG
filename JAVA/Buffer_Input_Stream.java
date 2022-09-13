package Exceptions;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Buffer_Input_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\ustjavafsdb216\\newFile.txt");
			BufferedInputStream input = new BufferedInputStream(file);
			int i= input.read();
			while(i!=-1) {
				System.out.print((char)i);
				i=input.read();
				Thread.sleep(200);
			}
			input.close();
		}
		catch(Exception e){
			e.getStackTrace();
		}
	}

}
