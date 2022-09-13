package Exceptions;

import java.io.FileInputStream;

public class CharByCharRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream input = new FileInputStream("C:\\Users\\ustjavafsdb216\\newFile.txt");
			System.out.println("Data in the file: ");
			
			int i = input.read();
			while(i!=-1) {
				System.out.print((char)i);
				//Thread.sleep(500);
				i=input.read();
			}
			input.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
